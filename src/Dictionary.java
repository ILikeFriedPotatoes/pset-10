import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.JButton;

public class Dictionary extends JFrame {
	
	//Creates the graphical components of the app
	static JPanel dictionaryWindow = new JPanel();
	static JButton addButton = new JButton("Add");
	static JButton removeButton = new JButton("Remove");
	static JFrame frame = new JFrame("Joseph's Dictionary");
	static JPanel viewWord = new JPanel();
	static JMenuBar menuBar = new JMenuBar();
	
	//main function
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new MainFrame();
				dictionaryWindow();
			}	
		});
		dictionaryWindow();
	}
	
	//creates the graphical application. Most code will go here.
	
	private static void dictionaryWindow() {
		
		
		frame.setJMenuBar(menuBar);
		
		//creates the remove and add button
		buttons();
		
		//Views the words
		mainViewWindow();
		
		//Create the search bar to search for words
		search();
		
		//Creates the ascending and descending checkboxes
		sort();
		
		//Creates the list of words in the scrollbox
		viewWords();
		
	}
	
	private static void buttons() {
		dictionaryWindow.add(addButton);
		dictionaryWindow.add(removeButton);
		frame.add(dictionaryWindow);
		frame.setVisible(true);
		
	}
	
	//shows the main viewing window
	private static void mainViewWindow() {
		frame.add(viewWord);
	}
	
	// Shows the search bar of the function
	private static void search() {
		
	}
	
	private static void sort() {
		
	}
	
	private static void viewWords() {
		
	}
}