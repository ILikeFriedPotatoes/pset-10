package app;
import javax.swing.JFrame;

import java.awt.BorderLayout;

public class DictionaryWindow extends JFrame{
	
	/**
	 * I don't know why eclipse wants me to include this, but I will.
	 */
	private static final long serialVersionUID = 1L;
	private Definition definition;
	private Toolbar toolbar;
	
	
	/**
	 * Creates the mainframe for the application
	 */
	public DictionaryWindow() {
		super("Joseph's Dictionary");
		
		setLayout(new BorderLayout());
		
		showFrame();
		
		createDefinition();
		
		showDefinition();
		
		makeToolbar();

		showToolbar();

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
		toolbar.setTextPanel(definition);
	}
	
	/**
	 * @showToolbar adds the toolbar
	 */
	
	private void showToolbar() {
		add(toolbar, BorderLayout.WEST);
	}
	
	/**
	 * @createTxtPnl - creates the text panel
	 */
	private void createDefinition() {
		definition = new Definition();
	}
	
	/**
	 * @showTxtPnl - shows the text panel that displays the words
	 */
	private void showDefinition() {
		add(definition, BorderLayout.CENTER);
	}
}



