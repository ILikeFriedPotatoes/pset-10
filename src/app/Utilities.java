package app;

import java.util.Arrays;

public class Utilities {
	public static String[] parseWords(Words[] words) {
		String[] onlyWords = new String[words.length];
		for(int i = 0; i < words.length; i ++) {
			onlyWords[i] = words[i].getWord();
		}
		return onlyWords;
	}
	
	public static Words[] sortWords(Words[] words) {
        Arrays.sort(words, (a, b) -> a.getWord().compareTo(b.getWord()));
        return words;
    }
	public static int indexOf(String target, String[] words) {
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(target)) {
                return i;
            }
        }
        return -1;
    }
	
	public static Words[] sortWordsDesc(Words[] words) {
        sortWords(words);        
        for (int i = 0; i < words.length / 2; i++) {
            Words temp = words[i];
            words[i] = words[words.length - i - 1];
            words[words.length - i - 1] = temp;
        }
        return words;
    }
}
