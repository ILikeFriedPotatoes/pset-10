import javax.*;
import javax.swing.JFrame;
import javax.swing.JPanel;

import javax.swing.JButton;

public class Dictionary extends JFrame {
	
	JPanel dictionaryWindow = new JPanel();
	JButton removeButton = new JButton("Remove");
	
	//main function
	public static void main(String[] args) {
		JFrame frame = new JFrame("Joseph's Dictionary");
		//((Dictionary) frame).BasicSwing();
		frame.setSize(400, 300);
		frame.setResizable(true);
		//frame.add(removeButton);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	//creates the graphical application. Most code will go here.
	/*
	private void BasicSwing() {
		setSize(400, 300);
		setResizable(true);
		
		dictionaryWindow.add(removeButton);
		add(dictionaryWindow);
		
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}*/
	
}