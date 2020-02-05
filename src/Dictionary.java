import javax.*;
import javax.swing.JFrame;
import javax.swing.JPanel;

import javax.swing.JButton;

public class Dictionary extends JFrame {
	
	static JPanel dictionaryWindow = new JPanel();
	static JButton addButton = new JButton("Add");
	static JButton removeButton = new JButton("Remove");
	
	//main function
	public static void main(String[] args) {
		dictionaryWindow();
	}
	
	//creates the graphical application. Most code will go here.
	
	private static void dictionaryWindow() {
		JFrame frame = new JFrame("Joseph's Dictionary");
		frame.setSize(400, 300);
		frame.setResizable(true);
		
		//creates the remove and add button
		dictionaryWindow.add(addButton);
		dictionaryWindow.add(removeButton);
		frame.add(dictionaryWindow);
		frame.setVisible(true);
		
		//closes the dictionary
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	private static void buttons() {
		
	}
	
	private static void mainViewWindow() {
		
	}
}