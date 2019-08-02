package com.freedom.task.hackerrank;

public class BalanceTree3 {
	
	static class Node{
		Node left;
		Node right;
		int ht;
		int val;
	}
	
	public static void main(String[] args)
	{
		int[] in= {3,2,4,5};
		Node node = new Node();
		for(int i=0;i<in.length;i++)
		{
			node =insertNode(node,in[i]);
		}
	}
	
	static Node insertNode(Node node, int val)
	{
		if(node==null)
		{
			node = new Node();
			node.left=null;
			node.right=null;
			node.ht=0;
			node.val=val;
		}
		if(val<node.val)
			node= insertNode(node.left,val);
		if(val>node.val)
		{
			node =insertNode(node.right,val);
		}
		int balancefactor = calculateBalanceFactor(node);
		if(balancefactor<-1)
		{
			if(calculateBalanceFactor(node.right)>0)
			{
				node.right =rotateright(node.right);
				return rotateleft(node);
			}
			else
				rotateleft(node);
		}
		else if(balancefactor >1)
		{
			if(calculateBalanceFactor(node.left)<0)
			{
				node.left = rotateleft(node.left);
				return rotateright(node);
			}
			else
				return rotateright(node);
		}
		
		int ht = height(node)+1;
		node.ht=ht;
		return node;
	}
	
	static Node rotateleft(Node node)
	{
		Node y= node.right;
		node.right=y.left;
		y.left=node;
		
		node.ht=height(node)+1;
		y.ht=height(y)+1;
		return y;
	}
	
	static Node rotateright(Node node)
	{
		Node y= node.left;
		node.left=y.right;
		y.right=node;
		
		node.ht=height(node)+1;
		y.ht=height(y)+1;
		return y;
	}
	
	
	static int calculateBalanceFactor(Node node)
	{
		int left =-1;
		int right =-1;
		if(node.left!=null)
			left = node.left.ht;
		if(node.right!=null)
			right = node.right.ht;
		return left-right;
		
	}
	static int height(Node node)
	{
		int left=-1;
		int right=-1;
		if(node.left!=null)
			left = node.left.ht;
		if(node.right!=null)
			right = node.right.ht;
		return Math.max(left, right);
		
	}

}
