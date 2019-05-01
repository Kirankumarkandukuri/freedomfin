package com.freedom.task.algorithms;

import java.util.HashSet;

public class FindPairOfIntegers {

  public static void main(String args[])
  {
    int[] arr = {2,3,4,5,6,7,3,9,11,14,15,0,10,8};

    int sum=10;

    HashSet<Integer> set = new HashSet<>(arr.length);
    for(int value:arr)
    {
      int n = sum-value;

      if(set.contains(n))
      {
        System.out.printf("(%d,%d) %n", value,n);
      }
      else
      {
        set.add(value);
      }

    }

    QuickSort1 sort = new QuickSort1();
    sort.sort(arr);
    int i=0; int j=arr.length-1;
    while(i<=j)
    {
      int arrSum = arr[i] + arr[j];
      if(arrSum == sum)
      {
        System.out.printf("(%d,%d) %n", arr[i],arr[j]);
        i++;
        j--;
      }

      if(arrSum<sum)
      {
        i++;
      }
      if(arrSum>sum)
      {
        j--;
      }
    }

  }

}
