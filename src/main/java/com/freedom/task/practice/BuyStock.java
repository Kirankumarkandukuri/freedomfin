package com.freedom.task.practice;

public class BuyStock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public int maxProfit(int[] prices) { 
		 
		 int min=prices[0], profit=0,profitsofar=0;
		 
		 for(int i=0;i<prices.length;i++)
		 {
			 min=Math.min(prices[i], min);
			 profit = prices[i]-min;
			 if(profit >profitsofar)
			 {
				 profitsofar=profit;
			 }
		 }
		 return profitsofar;
		 
	 }

}
