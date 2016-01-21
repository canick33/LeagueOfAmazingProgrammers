import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/* Declare the ChuckleClicker Class */
public class ChuckleClicker implements ActionListener {

	/* Declare the frame for this class */
	JFrame jFrame;
	/*
	 * Declare the buttons, so we can access these in the action listener event
	 */
	JButton jokeButton;
	JButton punchlineButton;

	/* Define the method for making the buttons */
	public void makeButtons() {
		/* Make a JFrame */
		jFrame = new JFrame("ChuckleClicker");

		/* Make the frame visible */
		jFrame.setVisible(true);

		/* Set the size of the frame */
		jFrame.setSize(275, 75);

		/* Make a JPanel */
		JPanel jPanel = new JPanel();

		/* Create two buttons */
		jokeButton = new JButton("Joke");
		punchlineButton = new JButton("Punchline");

		/* Add action listeners to the buttons */
		jokeButton.addActionListener((ActionListener) this);
		punchlineButton.addActionListener((ActionListener) this);

		/* Add the buttons to the panel */
		jPanel.add(jokeButton);
		jPanel.add(punchlineButton);

		/* Add the panel to the frame */
		jFrame.add(jPanel);

		/* Pack the buttons on the frame */
		jFrame.pack();

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		/* See if the event is from the joke button being pressed */
		if (arg0.getSource() == jokeButton) {
			JOptionPane.showMessageDialog(jFrame, "Did you hear about the race between the lettuce and the tomato?");
		} else {
			JOptionPane.showMessageDialog(jFrame, "The lettuce was a 'head' and the tomato was trying to 'ketchup'");
		}

	}

	/* Start the program here */
	public static void main(String[] args) {
		/* Create an instance of the ChuckleClicker class */
		ChuckleClicker chuckleClicker = new ChuckleClicker();

		/* Call the makeButtons method */
		chuckleClicker.makeButtons();

	}

}
