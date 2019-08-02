package com.freedom.task.java8.functionalInterface;

public class FInterface {

	public static void main1(String[] args) {
		  // lambda expression to create the object 
	    new Thread(()-> 
	       {System.out.println("New thread created");}).start(); 
	    
	    MyInterface inter = ( x) ->x*x;
	    
	    int ans =inter.calculate(5);
	    System.out.println(ans);
	    
	    Thread t = new Thread(()-> System.out.println("Yes"));
	    t.start();

}
}
