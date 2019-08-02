package com.freedom.task.algorithms;

public class QuickSort3 {
	
	int[] numbers;
	int length;
	
	public void sort(int[] values)
	{
		this.numbers=values;
		this.length=values.length;
		quicksort(0, this.length-1);
		
	}
	
	
	public void quicksort(int low, int high)
	{
		int i=low, j=high;
		
		int pivot = numbers[low+(high-low)/2];
		
		while(i<=j)
		{
			while(numbers[i]<pivot)
				i++;
			while(numbers[j]>pivot)
				j--;
			if(i<j)
			{
				swap(i,j);
				i++;j--;
			}
			
			if(low<j)
				quicksort(i,high);
			if(high>i)
				quicksort(low,j);
		}
	}
	
	void swap(int i, int j)
	{
		int temp = numbers[i];
		numbers[i]=numbers[j];
		numbers[j]=temp;
	}

}
