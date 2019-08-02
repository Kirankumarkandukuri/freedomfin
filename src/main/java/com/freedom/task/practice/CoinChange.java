package com.freedom.task.practice;

import java.util.Arrays;

public class CoinChange {
	
	  public int coinChange(int[] coins, int amount) {
		  
		  int[] am = new int[amount+1];
		  Arrays.fill(am, Integer.MAX_VALUE);
		  am[0]=0;
		  for(int i=1;i<amount;i++)
		  {
			 for(int j=0;j<coins.length;j++)
			 {
				 if(coins[j]<=i && am[i-coins[j]]!= Integer.MIN_VALUE)
				 {
					 am[i]= Math.min(am[i], 1+am[i-coins[j]]);
				 }
			 }
		  }
		  
		  if (am[amount] == Integer.MAX_VALUE)
				return -1;
		  else
				return am[amount];
	  }

}
