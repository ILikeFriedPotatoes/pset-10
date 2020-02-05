import javax.*;
import javax.swing.JFrame;
import javax.swing.JPanel;

import javax.swing.JButton;

public class Dictionary extends JFrame {
	
	JPanel dictionaryWindow = new JPanel();
	JButton removeButton = new JButton("Remove");
	
	public static void main(String[] args) {
		new BasicSwing();
		JFrame frame = new JFrame("Joseph's Dictionary");
	}
	
	private void BasicSwing() {
		super("Dictionary App");
		setSize(400, 300);
		setResizable(true);
		
		dictionaryWindow.add(removeButton);
		add(dictionaryWindow);
		
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
}