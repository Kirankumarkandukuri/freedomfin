package com.freedom.task.leetcode.dynamicProgramming;

import java.util.HashMap;
import java.util.Map;

public class HouseRobber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    Map<Integer, Integer> map = new HashMap<Integer, Integer>();
   public int rob(int[] nums) {

       return rob(nums,nums.length-1);
   }
   
   private int rob(int[] nums, int i) {
   if (i < 0) {
       return 0;
   }
       if(map.get(i)!=null)
           return map.get(i);
       int count =Math.max(rob(nums, i - 2) + nums[i], rob(nums, i - 1));
           map.put(i,count);
   return count;
}

}
