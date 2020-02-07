import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextArea;

import java.awt.BorderLayout;

public class MainFrame extends JFrame{
	
	private JTextArea textArea;
	private JButton btn;
	
	public MainFrame() {
		super("Joseph's Dictionary");
		
		setLayout(new BorderLayout());
		
		textArea = new JTextArea();
		btn = new JButton();
		
		add(textArea, BorderLayout.CENTER);
		add(btn, BorderLayout.SOUTH);
		
		setSize(400, 300);
		setResizable(true);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
