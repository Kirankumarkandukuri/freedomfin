package com.freedom.task.algorithms;

public class Intersection {

  public static void main(String args[])
  {
    int arr1[] = {1,2,3,4,9};

    int arr2[] = {2,4,6,7,8};


    int i=0; int j=0;

    while(i<arr1.length && j<arr2.length)
    {
      if(arr1[i]<arr2[j])
      {
        System.out.println(arr1[i]);
        i++;
      }
      else if (arr2[j]<arr1[i])
      {
        System.out.println(arr2[j]);
        j++;
      }
      else
      {
        System.out.println(arr2[j++]);
        i++;
      }

    }

    if(i<arr1.length)
    {
      for(int k=i;k<arr1.length;k++)
      System.out.println(arr1[k]);
    }

    if(j<arr2.length)
    {
      for(int k=j;k<arr2.length;k++)
        System.out.println(arr2[k]);
    }


  }

}
