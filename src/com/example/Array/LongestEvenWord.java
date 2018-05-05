package com.example.Array;

public class LongestEvenWord {

	public static void main(String[] args) {
		System.out.println(longestEvenWord("Write code for a great time"));
	}
	
	static String longestEvenWord(String sentence) {
		int size = 0;
		String longestword = "00";
        String wordArray[] = sentence.split("\\s");
        
        for(String word: wordArray) {
        	if(word.length() %2 == 0 && word.length() > size) {
        		size = word.length();
        		longestword = word;
        	}
        }
        
        return longestword;
    }

}
