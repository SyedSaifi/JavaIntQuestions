package com.example.StringManupilation;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class StringEncoding {

	public static void main(String[] args) {
		String str = "aaaabcccczzz=";
		String strEncoded = "";
		
		char[] charArray = str.toCharArray();
		int count = 1;
		for (int i = 0; i < charArray.length-1; i++) {
			if(charArray[i] == charArray[i+1])
				count++;
			else {
				strEncoded = strEncoded + charArray[i]+ count;
				count = 1;
			}
			
		}
		System.out.println("Encoded string is :: "+strEncoded);
		
	}

}
