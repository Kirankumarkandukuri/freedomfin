package com.freedom.task.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class NByK {

  public static void main(String args[]) {
    Integer[] arr = {3, 1, 2, 2, 1, 2, 3, 3};
    int k = 4;
    int j = arr.length/4;
    HashMap<Integer,Integer> hashMap = new HashMap<>();
    ArrayList<Integer> arrayList = new ArrayList(Arrays.asList(arr));
    arrayList.forEach(a -> {

      if(hashMap.get(a) == null)

      {
        hashMap.put(a,1);
      }
      else
        hashMap.put(a,hashMap.get(a)+1);

    });


    hashMap.forEach((ab,b )-> {
      if(b>j)
        System.out.println(ab);
    }  );

  }

}
