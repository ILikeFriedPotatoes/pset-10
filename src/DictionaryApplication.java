import javax.swing.SwingUtilities;

public class DictionaryApplication {
	
	//main function
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new MainFrame();
			}	
		});
	}
	
}