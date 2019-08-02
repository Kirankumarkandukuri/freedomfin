package com.freedom.task.leetcode;

/**
 * Given an integer array nums, find the contiguous subarray (containing at
 * least one number) which has the largest sum and return its sum.
 * 
 * Example:
 * 
 * Input: [-2,1,-3,4,-1,2,1,-5,4], Output: 6 Explanation: [4,-1,2,1] has the
 * largest sum = 6. Follow up:
 * 
 * If you have figured out the O(n) solution, try coding another solution using
 * the divide and conquer approach, which is more subtle.
 * 
 * @author kkandukuri
 *
 */
public class MaxSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { -2, -1 };
		maxSubArray(nums);
	}

	public static int maxSubArray(int[] nums) {

		int sum = nums[0];
		int prevSum = nums[0];


		for (int i = 1; i < nums.length; i++) {

			sum = Math.max(sum + nums[i], nums[i]);
			prevSum = Math.max(prevSum, sum);

		}

		return prevSum;

	}

}
