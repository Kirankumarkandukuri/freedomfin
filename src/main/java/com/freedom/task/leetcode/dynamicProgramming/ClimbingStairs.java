package com.freedom.task.leetcode.dynamicProgramming;

import java.util.HashMap;

public class ClimbingStairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	   HashMap<Integer, Integer> map = new HashMap<Integer,Integer>(); 
	    public int climbStairs(int n) {
	        if(map.get(n)!=null) return map.get(n);
	        if(n==1) return 1;
	        if(n==2) return 2;
	        if(n==0) return 0;
	        
	        map.put(n,climbStairs(n-1)+climbStairs(n-2));
	        
	        return map.get(n);
	        
	        
	    }

}
