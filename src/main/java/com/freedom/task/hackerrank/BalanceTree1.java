package com.freedom.task.hackerrank;

import java.util.Scanner;

import com.freedom.task.hackerrank.BalanceTree.Node;

public class BalanceTree1 {
	static class Node 
	{
		int val;   //Value
		int ht;      //Height
		Node left;   //Left child
		Node right;   //Right child

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node node = null;
		int[] input = {3, 2 ,4, 5};
		for(int i=0;i<4;i++)
		{
			node =insertNode(input[i],node);
		}
		node =insertNode(6,node);

	}
	
	public static Node insertNode(int b, Node node)
	{
		if(node==null)
		{
			node = new Node();
			node.val=b;
			node.ht=0;
			return node;
			
		}
		if(b<node.val)
			node.left=insertNode(b,node.left);
		else if(b>node.val)
			node.right=	insertNode(b,node.right);
		int balancefactor = calculateBalanceFactor(node);
		
		if(balancefactor<-1)
		{
			int rightbalancefactor = calculateBalanceFactor(node);
			if(rightbalancefactor>0)
			{
				node.right = rotateRight(node.right);
				return rotateLeft(node);
			}
			
			else
			{
				return rotateLeft(node);
			}
		}
			
		int ht = calculateHeight(node)+1;
		node.ht=ht;
		return node;
	}
	public static Node rotateLeft(Node x)
	{
		Node y = x.right;
		x.right = y.left;
		y.left = x;
		// height
		x.ht = calculateHeight(x)+1;
		y.ht = calculateHeight(y)+1;
		return x;
		
	}
	
	public static int calculateBalanceFactor( Node node)
	{
		int left =0;
		int right=0;
		if(node.right!=null)
			right=node.right.ht;
		if(node.left!=null)
			left=node.left.ht;
		
		return left-right;
	}
	
	public static int calculateHeight( Node root) {
			int maxHeight = -1;
			if(root.left != null)
				maxHeight = Math.max(maxHeight, root.left.ht);
			if(root.right != null)
				maxHeight = Math.max(maxHeight, root.right.ht);
			return maxHeight;
		
	}

}
