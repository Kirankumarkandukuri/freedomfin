package com.freedom.task.leetcode.dynamicProgramming;

public class JumpGame {

	public static void main(String[] args)
	{
		int[] n = {2,3,1,1,4};
		canJump(n);
	}
    public static boolean canJump(int[] A) {
        int max = 0;
  for(int i=0;i<A.length;i++){
      if(i>max) {return false;}
      max = Math.max(A[i]+i,max);
  }
  return true;
  }
}


