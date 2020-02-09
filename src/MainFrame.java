import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextArea;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame{
	
	/**
	 * I don't know why eclipse wants me to include this, but I will.
	 */
	private static final long serialVersionUID = 1L;
	private JButton rmvBtn;
	private JButton addBtn;
	private TxtPnl txtPnl;
	
	
	/**
	 * Creates the mainframe for the application
	 */
	public MainFrame() {
		super("Joseph's Dictionary");
		
		setLayout(new BorderLayout());
			
		createButtons();

		showButtons();
		
		showFrame();
		
		createTxtPnl();
		
		showTxtPnl();

		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	
	/**
	 * @showFrame deals with the graphical aspects of the frame
	 */
	
	private void showFrame() {
		setSize(600, 500);
		setResizable(true);
		setVisible(true);
	}
	
	/**
	 * @createButtons is where all the buttons are made and their methods assigned
	 */
	private void createButtons() {
		rmvBtn = new JButton("Remove");
		addBtn = new JButton("Add");
		
		rmvBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("remove");
			}
		});
		addBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("add");
				txtPnl.appendText("Test");
			}
		});
	}
	
	/**
	 * This function deals with the graphical parts of the button
	 */
	private void showButtons() {
		add(rmvBtn, BorderLayout.NORTH);
		add(addBtn, BorderLayout.SOUTH);
	}

	/**
	 * @createTxtPnl - creates the text panel
	 */
	private void createTxtPnl() {
		txtPnl = new TxtPnl();
		
	}
	
	/**
	 * @showTxtPnl - shows the text panel that displays the words
	 */
	private void showTxtPnl() {
		add(txtPnl, BorderLayout.CENTER);
	}
}



