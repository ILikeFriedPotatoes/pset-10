package app;
import java.io.FileReader;
import java.util.ArrayList;

public class Words {
	private String word;
	private String Definition;
	private String[] synonyms;
	private String[] antonyms;
	
	public Words(String word, String Definition, String[] synonyms, String[] antonyms) {
		this.word = word;
		this.Definition = Definition;
		this.synonyms = synonyms;
		this.antonyms = antonyms;
	}
	
	public String getWord() {
        return word;
    }
    
    public String[] getSyn() {
        return synonyms;
    }
    
    public String[] getAnt() {
        return antonyms;
    }
}
