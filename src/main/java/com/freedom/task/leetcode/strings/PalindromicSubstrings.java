package com.freedom.task.leetcode.strings;

public class PalindromicSubstrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		countSubstrings("aaa");
	}
	 public static int countSubstrings(String s) {
         int count=0;
       for(int i=0;i<s.length();i++){
           count+=extractPalindrome(s,i,i);//odd length
           count+=extractPalindrome(s,i,i+1);//even length
       }
       return count;
   }
   public static int extractPalindrome(String s, int left, int right){
       int count=0;
       while(left>=0 && right<s.length()&& (s.charAt(left)==s.charAt(right))){
           left--;
           right++;
           count++;
       }
       return count;
   }

}
