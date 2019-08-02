package com.freedom.task.paypal;

public class LongestPalindrome {
	
	public static void main(String[] args)
	{longpalin("apbaabp");
		
	}
	static void longpalin(String input)
	{
		char[] c = input.toCharArray();
		int[] asc = new int[128];
		
		for(int i=0;i<c.length;i++)
		{
			asc[(int)c[i]]++;
		}
		String beg = "", mid = "", end = ""; 
		
		for (char ch = 'a'; ch <= 'z'; ch++) { 
            if (asc[ch] % 2 == 1) { 
                mid = String.valueOf(ch); 
  
                asc[ch--]--; 
            }
            else { 
                for (int i = 0; i < asc[ch] / 2; i++) { 
                    beg += ch; 
                } 
            } 

}
		
		end = beg; 
        end = reverse(end); 
  
        // return palindrome string 
       System.out.println( beg + mid + end); 
	}
	
	 static String reverse(String str) { 
	        // convert String to character array  
	        // by using toCharArray  
	        String ans = ""; 
	        char[] try1 = str.toCharArray(); 
	  
	        for (int i = try1.length - 1; i >= 0; i--) { 
	            ans += try1[i]; 
	        } 
	        return ans; 
	    } 
}
