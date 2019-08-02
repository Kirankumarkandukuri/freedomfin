package com.freedom.task.hackerrank.Trees;

class Node {
public Node(int data2) {
		// TODO Auto-generated constructor stub
	}
int data;
Node left;
Node right;
}
public class BinarySearchTreeInsertion {
	


	 /* Node is defined as :
	 class Node 
	    int data;
	    Node left;
	    Node right;
	    
	    */

		public static Node insert(Node root,int data) {
	        if(root==null)
	        {
	            root=new Node(data);
	            return root;
	        }
	        if(data<root.data)
	        {
	           root.left= insert(root.left, data);

	        }
	        if(data>root.data)
	        {
	            root.right=insert(root.right,data);
	        }
	 return root;
	    	
	    }



}
