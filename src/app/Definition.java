package app;
import java.io.*;
import java.util.*;
import com.google.gson.*;

public class Definition {
	String definition;
    String POS;
    private Words[] words;
    
	private void getGSON() {
		Gson gson = new Gson();
		try(Reader reader = new FileReader(System.getProperty("user.dir") + File.separator + "words.json")) {
			this.words = gson.fromJson(reader, Words[].class);
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public void saveWords() {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        try (Writer writer = new FileWriter(System.getProperty("user.dir") + File.separator + "words.json")) {
            gson.toJson(words, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public Definition(String definition, String POS) {
        this.definition = definition;
        this.POS = POS;
    }
	    
    public String getDefinition() {
    	return definition;
    }
	    
	public String getPOS() {
		return POS;
	}
}
