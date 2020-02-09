import java.awt.BorderLayout;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class TxtPnl extends JPanel {
	
	private JTextArea searchBar;
	
	public TxtPnl() {
		searchBar = new JTextArea();
		
		setLayout(new BorderLayout());
		
		add(new JScrollPane(searchBar), BorderLayout.CENTER);
	}
	
	public void appendText(String text) {
		searchBar.append("\n" + text + "\n");
	}
}
