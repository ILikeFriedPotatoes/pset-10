package app;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class Toolbar extends JPanel implements ActionListener, DocumentListener {
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
	public static Words[] tbWords;
	public Words[] displayWords;
	public static JList wordsList;
	//public JList wordsList = new JList(Utilities.parseWords(tbWords));
	
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
		searchBar.getDocument().addDocumentListener(this);
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
        
        ArrayList<Words> sortedWrds = new ArrayList<Words>();
        while(filteredWords.size() > 0) {	
        	for (int i = 0; i < sort.size(); i++) {
                if (sorted.get(0) == sort.get(i)) {
                    sortedWrds.add(filteredWords.get(i));
                    sorted.remove(0);
                    sort.remove(i);
                    filteredWords.remove(i);
                }
            }
        }
        Words[] results = new Words[sortedWrds.size()];
        for (int i = 0; i < results.length; i++) {
            results[i] = sortedWrds.get(i);
        }
        setTBWords(results);
        remove(wordsList);
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

	@Override
	public void insertUpdate(DocumentEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeUpdate(DocumentEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void changedUpdate(DocumentEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	private void setTBWords(Words[] tbWords) {
        this.tbWords = tbWords;
    }
	
	
}
