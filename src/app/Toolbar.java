package app;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Toolbar extends JPanel implements ActionListener {
	private JButton rmvBtn;
	private JButton addBtn;
	private Definition txtPnl;
	private JPanel wordViewer;
	private JTextArea searchBar;
	private JButton ascending = new JButton();
	private JButton descending = new JButton();
	
	public Toolbar() {
		createButtons();
		showButtons();
		createSearchBar();
		createWordViewer();
		
	}
	
	
	/**
	 * @createWordViewer the word viewer is made here and given functionality
	 */
	private void createWordViewer() {
		wordViewer = new JPanel();
	}
	
	/**
	 * @createSearchBar the searchbar is made here and given functionality
	 */
	private void createSearchBar() {
		searchBar = new JTextArea();
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
