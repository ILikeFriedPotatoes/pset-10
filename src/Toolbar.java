import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Toolbar extends JPanel{
	private JButton rmvBtn;
	private JButton addBtn;
	
	public Toolbar() {
		createButtons();
		showButtons();
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
				//txtPnl.appendText("Test");
			}
		});
	}
	
	/**
	 * This function deals with the graphical parts of the button
	 */
	private void showButtons() {
		setLayout(new FlowLayout(FlowLayout.LEFT));
		add(rmvBtn);
		add(addBtn);
	}

	
	
}
