package com.example.Collections;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeat 
{  
    static void longestSubstring(String inputString)
    {
        char[] charArray = inputString.toCharArray();
         
        String longestSubstring = null;
        int longestSubstringLength = 0;
         
        Map<Character, Integer> charPosMap = new HashMap<>();
         
        for (int i = 0; i < charArray.length; i++) 
        {
            char ch = charArray[i];
            
            if(!charPosMap.containsKey(ch))
                charPosMap.put(ch, i);
            else
            {    
                i = charPosMap.get(ch);
                charPosMap.clear();
            }
             
            if(charPosMap.size() > longestSubstringLength)
            {
                longestSubstringLength = charPosMap.size();
                longestSubstring = charPosMap.keySet().toString();
            }
        }
         
        System.out.println("Input String : "+inputString);
         
        System.out.println("The longest substring : "+longestSubstring);
         
        System.out.println("The longest Substring Length : "+longestSubstringLength);
    }
     
    public static void main(String[] args) 
    {    
        longestSubstring("thelongestsubstring");
    }    
}