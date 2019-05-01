package com.freedom.task.algorithms;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.HashMap;

public class SplitBy3 {

  public static void main(String args[])
  {
    Integer[] arr = {-1,0,-1,0,-1,0};


    ArrayList<Integer> arrayList = new ArrayList(Arrays.asList(arr));

    Integer sum =arrayList.stream().reduce(0,Integer::sum);

System.out.println(sum);

  int start=0;
  int match=0;

    ArrayList<Integer> arrayList1 = new ArrayList();
    HashMap<Integer, Integer[]> map = new HashMap();

  for(int element: arrayList)
  {
    int rem = sum - arrayList.get(0);
    if(arrayList.contains(rem))
    {
      Integer[] arr1 ={arrayList.get(0),rem};
      match = arrayList.indexOf(rem);
      map.put(1, arr1);
    }
    else
      arrayList1.add(element);
  }
    SplitBy3 splitBy3 = new SplitBy3();
   if(!arrayList1.isEmpty())
   {
     splitBy3.split(  arrayList1,  sum);
   }

  }

  public void split( ArrayList<Integer> input, int sum)
  {

    ArrayList<Integer> arrayList1 = new ArrayList();
    HashMap<Integer, Integer[]> map = new HashMap();


    int match;
    int index =0;
    int rem =0;
    for(int element: input)
    {

      if(index==0)
      {
        index = input.indexOf(element);
         rem = sum - element;
      }

      if(input.contains(rem))
      {
        match = input.indexOf(rem);

        Integer[] arr1 ={input.get(0),rem};
        map.put(1, arr1);
      }
      else
        arrayList1.add(element);
    }

    SplitBy3 splitBy3 = new SplitBy3();
    if(!arrayList1.isEmpty())
    {
      splitBy3.split(  arrayList1,  sum);
    }
  }

}
