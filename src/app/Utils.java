package app;

import java.util.Arrays;

public class Utils {
	public static String[] parseWords(Words[] words) {
        String[] onlyWords = new String[words.length];
        for (int i = 0; i < words.length; i++) {
            onlyWords[i] = words[i].getWord();
        }
        return onlyWords;
    }
	
	public static Words[] sortWords(Words[] words) {
        Arrays.sort(words, (a, b) -> a.getWord().compareTo(b.getWord()));
        return words;
    }
}
