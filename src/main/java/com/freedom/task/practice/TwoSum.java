package com.freedom.task.practice;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	 public int[] twoSum(int[] numbers, int target) {
		 int[] re = new int[2];
		 
		Map<Integer, Integer> map = new HashMap();
		 for(int i=0;i<numbers.length;i++)
		 {
			 if(map.containsValue(target-numbers[i]))
			 {
				 re[0]=map.get(target-numbers[i]);
				 re[1]=i;
				 return re;
				 
			 }
			 else
				 map.put( numbers[i],i);
		 }
		 
		 return re;
	 }

}
