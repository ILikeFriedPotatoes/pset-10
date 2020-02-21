package app;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class Toolbar extends JPanel implements ActionListener {
	private JButton rmvBtn;
	private JButton addBtn;
	private JTextField searchBar;
	private JRadioButton ascending;
	private JRadioButton descending;
	private JScrollPane wordViewer;
	
	public Toolbar() {
		createButtons();
	
		showButtons();
		
		createSearchBar();
		
		showSearchBar();
		
		createAscending();
		
		showAscending();
		
		createDescending();
		
		showDescending();
		
		createWordViewer();
		
		showWordViewer();
	}
	
	/**
	 * @createWordViewer makes the word viewer
	 */
	
	private void createWordViewer() {
		wordViewer = new JScrollPane();
	}
	
	/**
	 * @showWordViewer deals with the graphical components of the word viewer
	 */
	
	private void showWordViewer() {
		add(wordViewer);
	}
	
	/**
	 * @createDescending makes the descending button
	 */
	
	private void createDescending() {
		descending = new JRadioButton();
	}
	
	/**
	 * @showDescending shows the descending button
	 */
	
	private void showDescending() {
		add(descending);
	}
	
	/**
	 * @createAscending makes the ascending button
	 */
	private void createAscending() {
		ascending = new JRadioButton();
	}
	
	/**
	 * @showAscending deals with the graphics
	 */
	private void showAscending() {
		setLayout(new FlowLayout(FlowLayout.LEADING));
		add(ascending, BorderLayout.CENTER);
	}
	
	/**
	 * @createSearchBar the searchbar is made here and given functionality
	 */
	private void createSearchBar() {
		searchBar = new JTextField();
	}
	
	/**
	 * @showSearchBar deals with the graphical aspects of the search bar
	 */
	
	private void showSearchBar() {
		add(searchBar);
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
	
	/**
	 * This function deals with the graphical parts of the button
	 */
	private void showButtons() {
		setLayout(new FlowLayout(FlowLayout.LEFT));
		add(addBtn);
		add(rmvBtn);
	}
	
	public void actionPerformed(ActionEvent e) {
		//getText function can get the text in a search bar
		JButton clicked = (JButton) e.getSource();
		
	}
}
