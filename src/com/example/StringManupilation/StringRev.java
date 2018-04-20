package com.example.StringManupilation;

public class StringRev {
	public static void main(String[] args) {
		String str = "hello my name is talib";
		
		String[] word = str.split("\\s");
		String revString="";
		
		for(int i=word.length -1 ;i >=0; i--) {
			revString+=word[i]+" ";
		}
		
		System.out.println(revString);
}
}
