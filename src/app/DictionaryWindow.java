package app;

import javax.swing.JFrame;
import com.google.gson.Gson;
import javax.swing.JList;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

public class DictionaryWindow extends JFrame{
	
	/**
	 * I don't know why eclipse wants me to include this, but I will.
	 */
	private static final long serialVersionUID = 1L;
	private static DefinitionViewer definitionViewer;
	private static Toolbar toolbar;
	private Words[] shownWords;
	GridBagConstraints gbc = new GridBagConstraints();
	
	/**
	 * Creates the mainframe for the application
	 */
	public DictionaryWindow(Words[] words) {
		this.shownWords = words;
		createView();
	}
	
	private void createView() {
		setTitle("Joseph's Dictionary");
		setLayout(new GridBagLayout());
		
		showFrame();
		
		createDefinition();
		
		createDefViewer();
		
		gbc.weightx = 1;
		gbc.weighty = 0.1;
		makeToolbar();
		add(toolbar, gbc);
		
		gbc.weighty = 5;
		gbc.gridx = 0;
		gbc.gridy = 3;
		gbc.gridwidth = 2;
		gbc.fill = GridBagConstraints.BOTH;
		add(Toolbar.wordViewer, gbc);
		
		//This ideally should be fixed. It throws a null pointer exception
		//Toolbar.wordsList = new JList<Object>(Utils.parseWords(Toolbar.tbWords));
        gbc.gridy = 4;
        gbc.gridx = 0;
        gbc.gridwidth = 2;
        add(Toolbar.wordsList, gbc);
        setVisible(true);
		
        Toolbar.wordsList = new JList<Object>(Utilities.parseWords(Toolbar.tbWords));
        gbc.gridy = 4;
        gbc.gridx = 0;
        gbc.gridwidth = 2;
        add(Toolbar.wordsList, gbc);
        setVisible(true);
        
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	/**
	 * @createDefViewer makes the definition viewer and specifies the properties
	 */
	private void createDefViewer() {
		gbc.weightx = 6;
		gbc.weighty = 1;
		gbc.gridx = 2;
		gbc.gridy = 0;
		gbc.gridheight = 4;
		gbc.fill = GridBagConstraints.BOTH;
		add(definitionViewer, gbc);
		gbc.gridheight = 1;
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
		toolbar = new Toolbar(shownWords);

		makeBtns();
		
		gbc.weighty = 0.1;
		gbc.gridwidth = 2;
		gbc.gridx = 0;
		gbc.gridy = 1;
		add(Toolbar.searchBar, gbc);
		gbc.gridwidth = 1;
		
		gbc.weighty = 0.1;
		gbc.gridx = 1;
		gbc.gridy = 2;
		add(Toolbar.descending, gbc);
		
		gbc.gridx = 0;
		add(Toolbar.ascending, gbc);
	}
	
	private void makeBtns() {
		gbc.weightx = 1;
		gbc.weighty = 0.1;
		gbc.gridx = 0;
		gbc.gridy = 0;
		add(Toolbar.addBtn, gbc);
		
		gbc.gridx = 1;
		gbc.gridy = 0;
		add(Toolbar.rmvBtn, gbc);
	}
	
	/**
	 * @createTxtPnl - creates the definition viewer, which displays the definition of the selected word
	 */
	private void createDefinition() {
		definitionViewer = new DefinitionViewer();
	}
	
	public Words[] getDisplayWords() {
        return shownWords;
    }
    
    public void setDisplayWords(Words[] words) {
        this.shownWords = words;
    }
}