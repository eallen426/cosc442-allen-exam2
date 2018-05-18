package ui;

import game.Creature;
import game.Item;

public class QuaffScreen extends InventoryBasedScreen {

	public QuaffScreen(Creature player) {
		super(player);
	}

	@Override
	protected String getVerb() {
		return "quaff";
	}

	@Override
	protected boolean isAcceptable(Item i) {
		return i.quaffEffect() != null;
	}

	@Override
	protected Screen use(Item i) {
		player.quaff(i);
		return null;
	}

}
