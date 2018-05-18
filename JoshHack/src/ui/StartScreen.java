package ui;

import java.awt.event.KeyEvent;

import asciiPanel.AsciiPanel;

public class StartScreen implements Screen {

	@Override
	public void displayOutput(AsciiPanel terminal) {
		terminal.write("COSC 442 Rougelike Game", 1, 1);
		terminal.writeCenter("-- press [enter] to start --", 22);
	}

	@Override
	public Screen respondToUserInput(KeyEvent e) {
		return e.getKeyCode() != KeyEvent.VK_ENTER ? this : new PlayScreen();
	}
}
