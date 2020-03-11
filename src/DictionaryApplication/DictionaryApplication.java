package DictionaryApplication;
  
import java.io.*;

import javax.swing.SwingUtilities;

import com.google.gson.*;

import app.DictionaryWindow;

public class DictionaryApplication {
	
	//main function
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new DictionaryWindow();
			}
		});
	}
	
	private void getGsonFile() {
        Gson gson = new Gson();
        try (Reader reader = new FileReader(System.getProperty("user.dir") + File.separator + "words.json")) {
            setWords(gson.fromJson(reader, Word[].class));
            Utils.sortWords(words);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}