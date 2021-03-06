package ui;

import java.awt.event.KeyEvent;
import java.util.ArrayList;
import asciiPanel.AsciiPanel;
import game.Creature;
import game.Item;

// TODO: Auto-generated Javadoc
/**
 * The Class InventoryBasedScreen.
 */
public abstract class InventoryBasedScreen implements Screen {

	/** The player. */
	protected Creature player;
	
	/** The letters. */
	private String letters;
	
	/**
	 * Gets the verb.
	 *
	 * @return the verb
	 */
	protected abstract String getVerb();
	
	/**
	 * Checks if is acceptable.
	 *
	 * @param i the i
	 * @return true, if is acceptable
	 */
	protected abstract boolean isAcceptable(Item i);
	
	/**
	 * Use.
	 *
	 * @param i the i
	 * @return the screen
	 */
	protected abstract Screen use(Item i);
	
	/**
	 * Instantiates a new inventory based screen.
	 *
	 * @param player the player
	 */
	public InventoryBasedScreen(Creature player){
		this.player = player;
		this.letters = "abcdefghijklmnopqrstuvwxyz";
	}
	
	/* (non-Javadoc)
	 * @see ui.Screen#displayOutput(asciiPanel.AsciiPanel)
	 */
	public void displayOutput(AsciiPanel terminal) {
		ArrayList<String> lines = getList();
		
		int y = 23 - lines.size();
		int x = 4;

		if (!lines.isEmpty())
			terminal.clear(' ', x, y, 20, lines.size());
		
		for (String line : lines){
			terminal.write(line, x, y++);
		}
		
		terminal.clear(' ', 0, 23, 80, 1);
		terminal.write("What would you like to " + getVerb() + "?", 2, 23);
		
		terminal.repaint();
	}
	
	/**
	 * Gets the list.
	 *
	 * @return the list
	 */
	private ArrayList<String> getList() {
		ArrayList<String> lines = new ArrayList<String>();
		Item[] inventory = player.inventory().getItems();
		
		for (int i = 0; i < inventory.length; ++i){
			Item item = inventory[i];
			
			if (item == null || !isAcceptable(item))
				continue;
			
			String line = letters.charAt(i) + " - " + item.glyph() + " " + player.nameOf(item);
			
			if(item == player.weapon() || item == player.armor())
				line += " (equipped)";
			
			lines.add(line);
		}
		return lines;
	}

	/* (non-Javadoc)
	 * @see ui.Screen#respondToUserInput(java.awt.event.KeyEvent)
	 */
	public Screen respondToUserInput(KeyEvent e) {
		char c = e.getKeyChar();

		Item[] items = player.inventory().getItems();
		
		if (letters.indexOf(c) > -1 
				&& items.length > letters.indexOf(c)
				&& items[letters.indexOf(c)] != null
				&& isAcceptable(items[letters.indexOf(c)])) {
			return use(items[letters.indexOf(c)]);
		} else if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {
			return null;
		} else {
			return this;
		}
	}
}
