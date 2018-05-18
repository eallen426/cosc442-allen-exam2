package ui;

import game.Creature;
import game.Item;

public class ExamineScreen extends InventoryBasedScreen {

	public ExamineScreen(Creature player) {
		super(player);
	}

	@Override
	protected String getVerb() {
		return "examine";
	}

	@Override
	protected boolean isAcceptable(Item i) {
		return true;
	}

	@Override
	protected Screen use(Item i) {
		String article = "aeiou".contains(player.nameOf(i).subSequence(0, 1)) ? "an " : "a ";
		player.notify("It's " + article + player.nameOf(i) + "." + i.details());
		return null;
	}
}
