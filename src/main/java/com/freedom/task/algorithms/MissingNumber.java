package com.freedom.task.algorithms;

import java.util.ArrayList;
import java.util.Arrays;

public class MissingNumber {

  private static int[] numbers;

  public static void main(String arg[])
  {
 int n=10;
  int sum=0;
  int totalSum =0;

  sum =(n*(n+1))/2;
   System.out.println(sum);
   int[] arr = {1,2,3,4,6,7,8,9,10};
   for(int i=0;i<arr.length;i++)
   {
     totalSum+=arr[i];
   }

    System.out.println(sum-totalSum);
    String[] arr1 = {"1","2","3", "abc"};
    ArrayList<String> arrayList = new ArrayList(Arrays.asList(arr1));
    if(arrayList.contains("1"))
    {
      System.out.println("found it");
    }

   int[] integerArray = {15,4,6,3,5,7,2,8,1};
    QuickSort1 sort = new QuickSort1();
    sort.sort(integerArray);
    numbers = integerArray;
    int searchableElement = 6;
 MissingNumber number =  new MissingNumber();
    number.binarySearch(0,integerArray.length-1,searchableElement);


  }

   public void binarySearch(int start,int end, int searchElement){

     int middlePos= start+ ((end-start)/2);
     if(searchElement == numbers[middlePos])
     {
       System.out.println("Element Found");
       return;
     }

     if(searchElement<numbers[middlePos])
     {
       binarySearch(start, middlePos, searchElement);
     }
     else
     {
       binarySearch(middlePos,end,searchElement);
     }
   }


}
