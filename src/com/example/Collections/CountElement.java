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
		  wordCount.put(word, wordCount.containsKey(word) ? wordCount.get(word)+1 : 1);
		}
		System.out.println("Map of occurances :: "+wordCount);
	}
}
