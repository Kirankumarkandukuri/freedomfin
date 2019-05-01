package com.freedom.task.algorithms;

import java.util.Arrays;

public class InvokeQuickSort {

  public static void main(String[] string)
  {
    QuickSort1 sort = new QuickSort1();
    int[] arr = {5,3,7,2,8,4,1,7,5,3,9,3};

    sort.sort(arr);

    Arrays.stream(arr).forEach( System.out::print);
  }

}
