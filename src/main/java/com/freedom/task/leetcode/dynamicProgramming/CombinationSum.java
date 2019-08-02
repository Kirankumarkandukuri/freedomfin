package com.freedom.task.leetcode.dynamicProgramming;

import java.util.Arrays;

public class CombinationSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {1,2};
		System.out.println(combinationSum4(nums,3));
	}

	private static int[] dp;

	public static int combinationSum4(int[] nums, int target) {
	    int[] dp = new int[target+1];
        dp[0] = 1;
        for(int i = 1; i <= target; i++){
            for(int num: nums){
                if(num <= i){
                    dp[i] += dp[i-num];
                }
            }
        }
        return dp[target];
	}

	
}
