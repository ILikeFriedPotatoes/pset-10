package app;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
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
		
		rmvBtn.addActionListener(this);
		addBtn.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		//getText function can get the text in a search bar
		JButton clicked = (JButton) e.getSource();
		
	}
}
