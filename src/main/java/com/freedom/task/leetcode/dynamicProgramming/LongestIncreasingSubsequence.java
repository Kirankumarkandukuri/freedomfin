package com.freedom.task.leetcode.dynamicProgramming;

//Input: [10,9,2,5,3,7,101,18]
//Output: 4 
//Explanation: The longest increasing subsequence is [2,3,7,101], therefore the length is 4. 
import java.util.Arrays;

public class LongestIncreasingSubsequence {

	
	 public int lengthOfLIS(int[] nums) {
	        
	       if(nums == null || nums.length==0)
	            return 0;
	        int[] dp = new int[nums.length];
	        Arrays.fill(dp,1);
	        int result = 1;
	        for(int i=1; i<nums.length; i++){
	            for(int j=0; j<i; j++){
	                if(nums[i]>nums[j]){
	                    dp[i]=Math.max(dp[j]+1,dp[i]);
	                }
	            }
	            result=Math.max(result, dp[i]);
	        }
	        return result;
	        
	        
	    }
}
