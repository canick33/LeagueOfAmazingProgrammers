import javax.swing.JOptionPane;

/*

	Show on the whiteboard: String name = JOptionPane.showInputDialog(“what is your name?”);
	JOptionPane.showMessageDialog(null, “Hi ” + name);

 */
public class Greeter {

	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("What is your name?");
		JOptionPane.showMessageDialog(null, "Hi " + name);
	}

}
