package com.example.Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class CountElement {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("aaa");
		list.add("bbb");
		list.add("aaa");

		Map<String, Integer> wordCount = new HashMap<String, Integer>();

		for(String word: list) {
		  Integer count = wordCount.get(word);  
		  wordCount.put(word, (count==null) ? 1 : count+1);
		}
		System.out.println("Map of occurances :: "+wordCount);
	}
}