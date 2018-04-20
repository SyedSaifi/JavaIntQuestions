package com.example.Collections;

import java.util.HashMap;
import java.util.Scanner;

public class FirstNonRepeated {

	public static void main(String[] args) {
		System.out.println(" Please enter the input string :");
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		char c = firstNonRepeatedCharacter(s);
		System.out.println("The first non repeated character is :  " + c);
	}

	public static Character firstNonRepeatedCharacter(String str) {
		Character c;
		HashMap<Character, Integer> chmap = new HashMap<Character, Integer>();
		
		for(Character ch: str.toCharArray()) {
			chmap.put(ch, chmap.containsKey(ch) ? chmap.get(ch)+1 : 1);
		}

		for (Character ch : str.toCharArray()) {
			if (chmap.get(ch) == 1)
				return ch;
		}
		return null;
	}
}