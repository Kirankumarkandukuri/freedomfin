package com.freedom.task.practice;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	Set<Integer> se = new HashSet<Integer>();
	
	  public boolean containsDuplicate(int[] nums) {
		  
		  for(int i=0;i<nums.length;i++)
		  {
			  if(!se.add(nums[i]))
			  {
				  return false;
			  }
		  }
		  return true;
		  
	  }

}
