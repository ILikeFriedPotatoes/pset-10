package DictionaryApplication;
  
import java.io.*;

import javax.swing.SwingUtilities;

import com.google.gson.Gson;

import app.DictionaryWindow;
import app.Utils;
import app.Words;

public class DictionaryApplication {
	private static Words[] words;
	//main function
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new DictionaryWindow(words);
			}
		});
	}
	
	//Create an application constructor here
	public DictionaryApplication() {
		getGsonFile();
		//DictionaryWindow = new DictionaryWindow(words);
	}
	
	
	private void getGsonFile() {
        Gson gson = new Gson();
        try (Reader reader = new FileReader(System.getProperty("user.dir") + File.separator + "words.json")) {
            setWords(gson.fromJson(reader, Words[].class));
            Utils.sortWords(words);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
	
	public void setWords(Words[] words) {
        this.words = words;
    }
}