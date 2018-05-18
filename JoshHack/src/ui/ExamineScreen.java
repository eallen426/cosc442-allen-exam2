package ui;

import game.Creature;
import game.Item;

// TODO: Auto-generated Javadoc
/**
 * The Class ExamineScreen.
 */
public class ExamineScreen extends InventoryBasedScreen {

	/**
	 * Instantiates a new examine screen.
	 *
	 * @param player the player
	 */
	public ExamineScreen(Creature player) {
		super(player);
	}

	/* (non-Javadoc)
	 * @see ui.InventoryBasedScreen#getVerb()
	 */
	@Override
	protected String getVerb() {
		return "examine";
	}

	/* (non-Javadoc)
	 * @see ui.InventoryBasedScreen#isAcceptable(game.Item)
	 */
	@Override
	protected boolean isAcceptable(Item i) {
		return true;
	}

	/* (non-Javadoc)
	 * @see ui.InventoryBasedScreen#use(game.Item)
	 */
	@Override
	protected Screen use(Item i) {
		String article = "aeiou".contains(player.nameOf(i).subSequence(0, 1)) ? "an " : "a ";
		player.notify("It's " + article + player.nameOf(i) + "." + i.details());
		return null;
	}
}
