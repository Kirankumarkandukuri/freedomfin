package com.freedom.task.algorithms;

public class QuickSort2 {
	  private int[] numbers;
	  private int number;
	
	public void sort(int[] values)
	{
		numbers=values;
		number=values.length;
		quicksort(0,number-1);
	}
	
	  private void quicksort(int low, int high) {
		  int i=low,j=high;
		  
		  int pivot=numbers[low+(high-low)/2];
		  while(i<=j) {
		  while(numbers[i]<pivot)
			  i++;
		  while(numbers[j]>pivot)
			  j--;
		  if(i<j)
		  {
			  //exchange
			  i++;
			  j--;
		  }
		  if(low<j)
			  quicksort(low,j);
		  if(i<high)
			  quicksort(i,high);
			
		  }
		  
	  }

}
