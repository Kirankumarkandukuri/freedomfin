package com.freedom.task.algorithms;

public class QuickSort1 {
int[] numbers;

  public  void sort(int[] arr)
   {
 numbers=arr;
 quicksort(0, arr.length-1);

   }

 private  void quicksort(int low, int high)
   {
     int i=low;
     int j=high;
     int pivot = numbers[low+(high-low)/2];

     while(i<=j)
     {
       while(numbers[i]< pivot)
       {
         i++;
       }

       while(numbers[j]>pivot)
       {
         j--;
       }

       if(i<=j)
       {
         int temp;
         temp=numbers[i];
         numbers[i]=numbers[j];
         numbers[j]=temp;
         i++;
         j--;
       }
     }

     if(low<j)
     {
       quicksort(low,j);
     }

     if(i<high)
     {
       quicksort(i,high);
     }
   }

}
