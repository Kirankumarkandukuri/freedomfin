package com.freedom.task.hackerrank;

import java.util.ArrayList;

public class ArraySolution {
    

 
    public static void main(String[] args) {

     int[][] a ={{1,3,4,2,5,6,9,8,7}, 
    		 {4,6,8,5,7,9,3,2,1}, 
    		 {7,9,2,8,1,3,6,5,4}, 
    		 {9,2,3,1,4,5,8,7,6}, 
    		 {3,5,7,4,6,8,2,1,9}, 
    		 {6,8,1,7,9,2,5,4,3}, 
    		 {5,7,6,9,8,1,4,3,2}, 
    		 {2,4,5,6,3,7,1,9,8}, 
    		 {8,1,9,3,2,4,7,6,5}};
        System.out.println();
        palindromeRearranging(a);

    	   
    	    System.out.println();
    }
    
    
  static  boolean palindromeRearranging(int[][] a) {
	  boolean found =true;
	    java.util.ArrayList<Integer> list = new ArrayList();
	    for(int i=0;i<a.length;i++)
	    {
	        int count=0;
	          for(int j=0;j<a[0].length;j++)
	          {
	              if(!list.contains(a[i][j])){
	                  list.add(a[i][j]);
	              if(a[i][j]==1)  count++;
	              if(a[i][j]==2)  count++;
	              if(a[i][j]==3)  count++;
	              if(a[i][j]==4)  count++;
	              if(a[i][j]==5)  count++;
	              if(a[i][j]==6)  count++;
	              if(a[i][j]==7)  count++;
	              if(a[i][j]==8)  count++;
	              if(a[i][j]==9)  count++;
	              }
	                 
	          }
	        if(count!=9)
	            return false;
	        else
	               list = new ArrayList();
	    }
	    
	    list = new ArrayList();
	       for(int i=0;i<a[0].length;i++)
	    {
	        int count=0;
	          for(int j=0;j<a.length;j++)
	          {
	               if(!list.contains(a[j][i])){
	                  list.add(a[j][i]);
	              if(a[j][i]==1)  count++;
	              if(a[j][i]==2)  count++;
	              if(a[j][i]==3)  count++;
	              if(a[j][i]==4)  count++;
	              if(a[j][i]==5)  count++;
	              if(a[j][i]==6)  count++;
	              if(a[j][i]==7)  count++;
	              if(a[j][i]==8)  count++;
	              if(a[j][i]==9)  count++;
	               }
	                 
	          }
	        if(count!=9)
	            return false;
	        else
	               list = new ArrayList();
	    }
	    
	    int rowstart=0;
	    int rowend=3;
	      int columnstart=0;
	    int columnend=3;
	    while(columnend<a[0].length){
	        rowstart=0;
	        rowend=3;
	    while(rowend<a.length){
	    int count=0;
	    
	        for(int i=rowstart;i<rowend;i++)
	    {
	        
	          for(int j=columnstart;j<columnend;j++)
	          {
	        	  if(!list.contains(a[j][i])){
	              if(a[i][j]==1)  count++;
	              if(a[i][j]==2)  count++;
	              if(a[i][j]==3)  count++;
	              if(a[i][j]==4)  count++;
	              if(a[i][j]==5)  count++;
	              if(a[i][j]==6)  count++;
	              if(a[i][j]==7)  count++;
	              if(a[i][j]==8)  count++;
	              if(a[i][j]==9)  count++;
	        	  }
	                 
	          }
	        
	             
	    }
	        
	        if(count!=9)
	            return false;
	        else
	        list = new ArrayList();
	        rowstart=rowstart+3;
	       
	        rowend=rowend+3;
	        
	    }
	       
	         columnstart=columnstart+3;
	       
	        columnend=columnend+3;
	    }
	    return true;
	    
	 

}
  
  boolean stringsRearrangement(String[] inputArray) {
	    
	    boolean[] used = new boolean[inputArray.length];
	    findSequence(inputArray, null, used, 0);

	    return success;
	}

	boolean success = false;

	void findSequence(String[] a, String prev, boolean[] used, int n) {

	    if (n == a.length) {
	        success = true;
	        return;
	    }

	    for (int i = 0; i < a.length; i++) {
	        if (!used[i] && (prev == null || differByOne(prev, a[i]))) {
	            used[i] = true;
	            findSequence(a, a[i], used, n+1);
	            used[i] = false;
	        }
	    }
	}

	boolean differByOne(String a, String b) {
	    int count = 0;
	    for (int i = 0; i < a.length(); i++) {
	        if (a.charAt(i) != b.charAt(i)) {
	            count++;
	        }
	    }

	    return count == 1;
	}
}