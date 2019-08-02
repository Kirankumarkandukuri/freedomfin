package com.freedom.task.gayle2;

import java.util.LinkedList;

public class Q1RemoveDups {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<Integer> list = new LinkedList<Integer> ();
		list.add(10);
		list.add(8);
		list.add(8);
		list.add(6);
		list.add(51);
		list.add(6);
		list.add(2);
		list.add(13);
		
		
		for(int i: list)
		{
			list.remove((Integer)i);
			list.add(i, (Integer)i);
		}
		
		for(int i: list)
		{
			System.out.println(i);
		}
		

	}

}
