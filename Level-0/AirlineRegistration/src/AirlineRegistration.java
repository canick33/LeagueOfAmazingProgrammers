import javax.swing.JOptionPane;

/**
 * Airline registration
 * 
 * You are writing a program for a new airline to take their registration
 * information at the check-in counter and print their boarding pass. You need
 * to collect the following information: First name Last name Destination
 * airport Birthday (for security purposes) Male/female (for security purposes)
 * 
 * Print the boarding pass in this format: LAST NAME / FIRST NAME (BIRTHDAY,
 * M/F) Traveling to: DESTINATION
 * 
 * Toolbox: main() method, JOptionPane.showInputDialog, variables
 * 
 **/
public class AirlineRegistration {

	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null,
				"Welcome to the Airline Registration System\n" +
				"Could you please answer a few questions?\n\n");
		String firstName = JOptionPane.showInputDialog("What is your first name?");
		String lastName = JOptionPane.showInputDialog("What is your last name?");
		String destination = JOptionPane.showInputDialog("What is your destination?");
		String birthday = JOptionPane.showInputDialog("What is your birthday?");
		String maleFemale = JOptionPane.showInputDialog("Are you male or female (M/F)?");
		
		System.out.println(lastName + " / " +
						   firstName + " (" +
						   birthday + ", " +
						   maleFemale + ") Traveling to: " +
						   destination);
	}
}
