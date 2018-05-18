package ui;

import java.awt.event.KeyEvent;

import asciiPanel.AsciiPanel;

// TODO: Auto-generated Javadoc
/**
 * The Class WinScreen.
 */
public class WinScreen implements Screen {

	/* (non-Javadoc)
	 * @see ui.Screen#displayOutput(asciiPanel.AsciiPanel)
	 */
	@Override
	public void displayOutput(AsciiPanel terminal) {
		terminal.write("You won.", 1, 1);
		terminal.writeCenter("-- press [enter] to restart --", 22);
	}

	/* (non-Javadoc)
	 * @see ui.Screen#respondToUserInput(java.awt.event.KeyEvent)
	 */
	@Override
	public Screen respondToUserInput(KeyEvent key) {
		return key.getKeyCode() != KeyEvent.VK_ENTER ? this : new PlayScreen();
	}
}
