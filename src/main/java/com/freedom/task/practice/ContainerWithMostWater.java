package com.freedom.task.practice;

public class ContainerWithMostWater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int maxArea(int[] height) {
		
		int start=0; int end =height.length-1;
		int vol =0;
		while(start<end)
		{
			vol=Math.max(vol, Math.min(height[start], height[end])*(end-start));
		}
		if(height[start]<height[end])
			start++;
		else
			end--;
		return vol;
		
	}

}
