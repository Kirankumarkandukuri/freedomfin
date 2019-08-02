package com.freedom.task.leetcode.strings;

public class LongestRepeatingCharacterReplacement {

	public static void main(String[] args)
	{
		characterReplacement("AABABBA",1);
	}
	
	public static int characterReplacement(String s, int k) {int[] count = new int[128];
    int max=0;
    int start=0;
    for(int end=0; end<s.length(); end++)
    {
        max = Math.max(max, ++count[s.charAt(end)]);
        if(max+k<=end-start)
            count[s.charAt(start++)]--;
    }
    return s.length()-start;
    }
}
