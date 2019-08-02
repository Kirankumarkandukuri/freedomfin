package com.freedom.task.map;

public class TestMap {

	public static void main(String[] args) {
		
		  MyHashMap<String, String> myMap = new MyHashMap<>();
		    myMap.put("USA", "Washington DC");
		    myMap.put("USAAAA", "Washington DC");
		    myMap.put("Nepal", "Kathmandu");
		    myMap.put("India", "New Delhi");
		    myMap.put("Australia", "Sydney");
		// TODO Auto-generated method stub
		    System.out.println(myMap.get("USA"));

	}

}
