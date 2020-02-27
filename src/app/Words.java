package app;
import java.io.FileReader;
import java.util.ArrayList;

public class Words {
	private String word;
	private ArrayList<String> Definitions;
	private ArrayList<String> synonyms;
	private ArrayList<String> antonyms;
	
	public Words(String word, ArrayList<String> Definition, ArrayList<String> synonyms, ArrayList<String> antonyms) {
		this.word = word;
		this.Definitions = Definition;
		this.synonyms = synonyms;
		this.antonyms = antonyms;
	}
	
	public String getWord() {
        return word;
    }
    
    public ArrayList<String> getSyn() {
        return synonyms;
    }
    
    public ArrayList<String> getAnt() {
        return antonyms;
    }
    
    public ArrayList<String> getDefinitions() {
    	return Definitions;
    }
    
}
