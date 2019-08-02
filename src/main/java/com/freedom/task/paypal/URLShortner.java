package com.freedom.task.paypal;

public class URLShortner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=1234567894;
		 // Map to store 62 possible characters 
	   String s = "abcdefghijklmnopqrstuvwxyzABCDEF"
	                 +"GHIJKLMNOPQRSTUVWXYZ0123456789"; 
	   char[] map = s.toCharArray();
	  
	    String shorturl=""; 
	  
	    // Convert given integer id to a base 62 number 
	    while (n>0) 
	    { 
	        // use above map to store actual character 
	        // in short url 
	        shorturl= shorturl+map[n%62]; 
	        n = n/62; 
	    } 
	  
	    System.out.println(shorturl);

	}

}
