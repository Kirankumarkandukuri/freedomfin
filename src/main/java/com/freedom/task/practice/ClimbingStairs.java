package com.freedom.task.practice;

import java.util.HashMap;

public class ClimbingStairs {
	
	HashMap<Integer,Integer> mem =  new HashMap<>();
	  public int climbStairs(int n) {
		  if(mem.containsKey(n)) return mem.get(n);
		  if(n==1)
			  return 1;
		  if(n==2)
			  return 2;
		  
		  int count = climbStairs(n-1)+climbStairs(n-2);
		  mem.put(n,count);
		  
		  return count;
	  }

}
