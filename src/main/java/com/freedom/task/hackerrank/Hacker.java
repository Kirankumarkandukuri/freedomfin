package com.freedom.task.hackerrank;
import java.util.Scanner;

public class Hacker {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        char c[] = s.toCharArray();
        java.util.Arrays.sort(c);
        String[] lex = new String[c.length-k+1];
        int j=0;
        for(int i=0;i<c.length-k+1;i++)
        {
        	System.out.println(c.length);
             lex[j]=s.substring(i,i+k);
             j++;
        }
         smallest =lex[0];
         largest=lex[0];
           for(int i=0;i<c.length-k+1;i++)
        {
             if(lex[i].compareTo(largest)>0)
             {
             largest=lex[i];
             }
               if(lex[i].compareTo(smallest)<0)
             smallest=lex[i];
             
        }

        
        return smallest + "\n" + largest;
    }
    
    public static void main(String[] args) {
       
      
        System.out.println(getSmallestAndLargest("welcometojava", 3));
    }
}


