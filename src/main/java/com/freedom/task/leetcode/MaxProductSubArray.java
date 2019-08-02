package com.freedom.task.leetcode;

public class MaxProductSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int[] nums = {-2,0,-1};maxProduct(nums);
	}
	
	  public static int maxProduct(int[] nums) {
	      int min=1,max=1;int imax=1;
	        for(int i=0;i<nums.length;i++)
	        {
	            if(nums[i]<0){
	                int temp =min;
	                min=max;
	                max=temp;
	            }
	            
	        
	            min = Math.min(min*nums[i],nums[i]);
	            max= Math.max(max*nums[i],nums[i]);
	            imax= Math.max(max,imax);
	        }
	        
	        return imax;
	        
	    }

}
