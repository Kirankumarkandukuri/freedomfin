package com.freedom.task.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class ThreeSum {
	
	public List<List<Integer>> threeSum(int[] nums) {
		HashSet<List<Integer>> set = new HashSet<List<Integer>>();
		Arrays.sort(nums);
		
		int sum=0;
		for(int i=0;i<nums.length-2;i++)
		{
			int start =i+1;int  end=nums.length-1;
		while(start<end)
		{
			
			sum = nums[i]+nums[start]+nums[end];
			if(sum==0)
			{
				
				set.add(Arrays.asList(nums[i],nums[start++],nums[end--]));
			}
			if(sum<0)
				start++;
			else if(sum>0)
				end--;
		}
		
	}
		return new ArrayList<>(set);
	}

}
