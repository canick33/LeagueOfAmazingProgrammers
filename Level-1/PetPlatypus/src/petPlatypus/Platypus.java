package petPlatypus;

/* Declare the Platypus class */
public class Platypus {

	/* Create some instance variables */
	private String name; /* The name of our platypus (initially null) */

	// 3. Create a constructor in the platypus class so that you can give
	// your platypus a name.
	/* Constructor for the Platypus class */
	Platypus(String nameIn) {
		/* Initialize the instance variable name, with the nameIn */
		name = nameIn;
	}

	/* sayHi method - prints a message containing the name of the platypus */
	void sayHi() {
		System.out.println("The platypus " + name + " is smarter than your average platypus");
	}

	/* Start the program here */
	public static void main(String[] args) {
		// 1. Make an instance of your new pet platypus
		Platypus myPlatypus = new Platypus("Scott");

		// 2. Call the sayHi method
		myPlatypus.sayHi();

	}

}
