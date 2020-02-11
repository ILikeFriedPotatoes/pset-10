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
	private TxtPnl txtPnl;
	private Toolbar toolbar;
	
	
	/**
	 * Creates the mainframe for the application
	 */
	public MainFrame() {
		super("Joseph's Dictionary");
		
		setLayout(new BorderLayout());
		
		showFrame();
		
		makeToolbar();

		showToolbar();
		
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
	 * @makeToolbar creates the toolbar
	 */
	private void makeToolbar() {
		toolbar = new Toolbar();
		toolbar.setTextPanel(txtPnl);
	}
	
	/**
	 * @showToolbar adds the toolbar
	 */
	
	private void showToolbar() {
		add(toolbar, BorderLayout.NORTH);
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



