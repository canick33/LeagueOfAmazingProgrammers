/*

"If you are turned into a zombie, your zombie self will need instructions
to pass as a human. Make a list with instructions for your typical morning."
Guide students through creating a new Class, Main Method, and JOptionPane
pop-ups for each item.

 */

import javax.swing.JOptionPane;

public class MorningZombie {

	public static void main(String[] args) {
		JOptionPane.showMessageDialog(
				null, "So, you are a Zombie now.\n"
				+ "You will have to do the following to pretend to be human\n"
				+ "1) Try to smile.  Zombies always look sad\n"
				+ "2) Keep your hands by your side.\n"
				+ "3) Speak clearly.  (No grunts and groans)");
	}

}
