package com.freedom.task.gayle2;

public class Node {
	Node next;
	int data;
	
	Node(int data)
	{
		this.data=data;
	}
	
	void appendToTrail(int d)
	{
		Node end = new Node(d);
		
	  Node n = this;
	  
	  while(n.next !=null)
	  {
		  n= n.next;
	  }
	  n.next=end;
	}

}
