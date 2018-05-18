package ui;

import game.Creature;
import game.Item;

public class ReadScreen extends InventoryBasedScreen {

	private int sx;
	private int sy;
	
	public ReadScreen(Creature player, int sx, int sy) {
		super(player);
		this.sx = sx;
		this.sy = sy;
	}

	@Override
	protected String getVerb() {
		return "read";
	}

	@Override
	protected boolean isAcceptable(Item i) {
		return !i.writtenSpells().isEmpty();
	}

	@Override
	protected Screen use(Item item) {
		return new ReadSpellScreen(player, sx, sy, item);
	}

}
