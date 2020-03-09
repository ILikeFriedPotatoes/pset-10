package app;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;

import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class Toolbar extends JPanel implements ActionListener {
	/**
	 * Eclipse told me to add this
	 */
	private static final long serialVersionUID = 1L;
	public static JButton rmvBtn;
	public static JButton addBtn;
	public static JTextField searchBar;
	public static JRadioButton ascending;
	public static JRadioButton descending;
	public static JScrollPane wordViewer;
	public Words[] tbWords;
	public Words[] displayWords;
	public JList wordsList = new JList(Utils.parseWords(tbWords));
	
	public Toolbar() {
		
		createButtons();
		
		createSearchBar();
		
		createAscending();
		
		createDescending();
		
		createWordViewer();
	}
	
	/**
	 * @createWordViewer makes the word viewer
	 */
	
	private void createWordViewer() {
		wordViewer = new JScrollPane();
		wordViewer.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		add(wordViewer);
	}
	
	/**
	 * @createDescending makes the descending button
	 */
	
	private void createDescending() {
		descending = new JRadioButton("Desc");
	}
	
	/**
	 * @createAscending makes the ascending button
	 */
	private void createAscending() {
		ascending = new JRadioButton("Asc");
	}
	
	/**
	 * @createSearchBar the searchbar is made here and given functionality
	 */
	private void createSearchBar() {
		searchBar = new JTextField("Search");
	}
	
	/**
	 * @createButtons is where all the buttons are made and their methods assigned
	 */
	private void createButtons() {
		rmvBtn = new JButton("Remove");
		addBtn = new JButton("Add");
		
		addWord addWord = new addWord();
		rmvWord rmvWord = new rmvWord();
		
		rmvBtn.addActionListener(rmvWord);
		addBtn.addActionListener(addWord);
	}
	
	public void actionPerformed(ActionEvent e) {
		//getText function can get the text in a search bar
		JButton clicked = (JButton) e.getSource();
		System.out.println("Test");
	}
	
	private void search() {
		String searchTerm = searchBar.getText().toLowerCase();
		ArrayList<Words> filteredWords = new ArrayList<Words>();
	    ArrayList<Integer> sort = new ArrayList<Integer>();
	    ArrayList<Integer> sorted = new ArrayList<Integer>();
	    
	    for (Words word: getDisplayWords()) {
            if (word.getWord().contains(searchTerm)) {
                filteredWords.add(word);
                sort.add(word.getWord().indexOf(searchTerm));
                sorted.add(word.getWord().indexOf(searchTerm));
            }
        }
        Collections.sort(sorted);
	}
	
	private class addWord implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			System.out.println("Add word");
		}
	}
	
	private class rmvWord implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			System.out.println("Remove word");
		}
	}
	
	public Words[] getDisplayWords() {
        return displayWords;
    }
}
