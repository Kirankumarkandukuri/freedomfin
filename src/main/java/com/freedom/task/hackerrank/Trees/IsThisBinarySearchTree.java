package com.freedom.task.hackerrank.Trees;

public class IsThisBinarySearchTree {
	
	/* Hidden stub code will pass a root argument to the function below. Complete the function to solve the challenge. Hint: you may want to write one or more helper functions.  

	The Node class is defined as follows:
	    class Node {
	        int data;
	        Node left;
	        Node right;
	     }
	*/
	    boolean checkBST(Node root) {

	       
	      return check(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
	        
	    }

	boolean check(Node root, Integer minVal, Integer maxVal) {
		 if (root == null) return true;
	        if (root.data >= maxVal || root.data <= minVal) return false;
	        return check(root.left, minVal, root.data) && check(root.right, root.data, maxVal);
	}



}
