package com.freedom.task.java8.functionalInterface;

public class FInterface {

	public static void main(String[] args) {
		  // lambda expression to create the object 
	    new Thread(()-> 
	       {System.out.println("New thread created");}).start(); 
	    
	    MyInterface inter = (int x) ->x*x;
	    
	    int ans =inter.calculate(5);
	    System.out.println(ans);

}
}
