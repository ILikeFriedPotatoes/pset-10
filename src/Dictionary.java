import javax.*;
import javax.swing.JFrame;
import javax.swing.JPanel;

import javax.swing.JButton;

public class Dictionary extends JFrame {
	
	static JPanel dictionaryWindow = new JPanel();
	static JButton addButton = new JButton("Add");
	static JButton removeButton = new JButton("Remove");
	static JFrame frame = new JFrame("Joseph's Dictionary");
	
	//main function
	public static void main(String[] args) {
		dictionaryWindow();
	}
	
	//creates the graphical application. Most code will go here.
	
	private static void dictionaryWindow() {
		frame.setSize(400, 300);
		frame.setResizable(true);
		
		//creates the remove and add button
		buttons();
		
		//Views the words
		mainViewWindow();
		
		search();
		
		sort();
		
		viewWords();
		
		//closes the dictionary
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	private static void buttons() {
		dictionaryWindow.add(addButton);
		dictionaryWindow.add(removeButton);
		frame.add(dictionaryWindow);
		frame.setVisible(true);
		
	}
	
	//shows the main viewing window
	private static void mainViewWindow() {
		
	}
	
	// Shows the search bar of the function
	private static void search() {
		
	}
	
	private static void sort() {
		
	}
	
	private static void viewWords() {
		
	}
}