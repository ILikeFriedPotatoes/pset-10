package app;

public class Utilities {
	public static String[] parseWords(Words[] words) {
		String[] onlyWords = new String[words.length];
		for(int i = 0; i < words.length; i ++) {
			onlyWords[i] = words[i].getWord();
		}
		return onlyWords;
	}
}
