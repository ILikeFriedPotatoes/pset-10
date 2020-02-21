package app;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Toolbar extends JPanel implements ActionListener {
	private JButton rmvBtn;
	private JButton addBtn;
	private Definition txtPnl;
	private JPanel wordViewer;
	private JTextField searchBar;
	private JRadioButton ascending = new JRadioButton();
	private JRadioButton descending = new JRadioButton();
	
	public Toolbar() {
		createButtons();
	
		showButtons();
		
		createSearchBar();
		
		showSearchBar();
		
		createWordViewer();
		
		showWordViewer();
		
	}
	
	
	/**
	 * @createWordViewer the word viewer is made here and given functionality
	 */
	private void createWordViewer() {
		wordViewer = new JPanel();
	}
	
	/**
	 * @showWordViewer shows the word viewer and adds graphics
	 */
	
	private void showWordViewer() {
		setLayout(new FlowLayout(FlowLayout.LEFT));
		add(wordViewer);
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
		setLayout(new FlowLayout(FlowLayout.CENTER));
		add(searchBar, BorderLayout.CENTER);
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
		JButton clicked = (JButton) e.getSource();
		
	}

	public void setTextPanel(Definition txtPnl) {
		this.txtPnl = txtPnl;
	}
	
}
