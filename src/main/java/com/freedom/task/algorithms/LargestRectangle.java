package com.freedom.task.algorithms;

import java.util.Stack;

public class LargestRectangle {
	
	public static void main(String[] args)
	{
		int[] h = {1,2,3,4,5};
		long result = largestRectangle(h);
	}
	
	static long largestRectangle(int[] h)
	{
		Stack<Integer> stack = new Stack<Integer>();
		int max=0;
		int i=0;
		while(i<h.length)
		{
			if(stack.isEmpty()|| h[i]>stack.peek())
			{
				stack.push(i);
				i++;
			}
			else {
				int p=stack.pop();
				int ha=h[p];
				int w= stack.isEmpty()?i:i-stack.peek()-1;
				max= Math.max(ha*w, max);
				
			}
		}
		
		  while (!stack.isEmpty()) {
		        int p = stack.pop();
		        int ha = h[p];
		        int w = stack.isEmpty() ? i : i - stack.peek() - 1;
		        max = Math.max(ha * w, max);
		    }
		  
		  return max;
	}

}
