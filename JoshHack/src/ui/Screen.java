package ui;

import java.awt.event.KeyEvent;

import asciiPanel.AsciiPanel;

// TODO: Auto-generated Javadoc
/**
 * The Interface Screen.
 */
public interface Screen {
	
	/**
	 * Display output.
	 *
	 * @param terminal the terminal
	 */
	public void displayOutput(AsciiPanel terminal);
	
	/**
	 * Respond to user input.
	 *
	 * @param e the e
	 * @return the screen
	 */
	public Screen respondToUserInput(KeyEvent e);
}
