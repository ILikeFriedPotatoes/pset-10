import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextArea;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame{
	
	private JButton rmvBtn;
	private JButton addBtn;
	// I might use this for the search bar later:
	//private JTextArea textArea;
	
	public MainFrame() {
		super("Joseph's Dictionary");
		
		setLayout(new BorderLayout());
			
		showButtons();
		
		setSize(600, 500);
		setResizable(true);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	
	
	private void showButtons() {
		rmvBtn = new JButton("Remove");
		addBtn = new JButton("Add");
		
		rmvBtn.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				System.out.println("does this work?");
			}
			
		});
		addBtn.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				System.out.println("does this work?");
			}
			
		});
		
		add(rmvBtn, BorderLayout.NORTH);
		add(addBtn, BorderLayout.NORTH);
	}
	
}

