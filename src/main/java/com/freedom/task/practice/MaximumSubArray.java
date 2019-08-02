package com.freedom.task.practice;

public class MaximumSubArray {
	
	 public int maxSubArray(int[] nums) {
		 int sum=nums[0];
		 
		 for(int i=1;i<nums.length;i++)
		 {
			 sum =Math.max(sum+nums[i], nums[i]);
		 }
		 
		 return sum;
		 
	 }

}
