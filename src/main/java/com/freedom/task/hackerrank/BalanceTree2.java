package com.freedom.task.hackerrank;

public class BalanceTree2 {
	class Node{
		Node left;
		Node right;
		int ht;
		int val;
	}
	
	public static void main(String[] args) {
		
		int[] input = {3,2,4,5};
		Node node = null;
		for(int i=0;i<input.length;i++)
		{
			node = insertNode(node,i);
		}
	}
	
	static Node insertNode(Node node, int val) {
		
		if(node==null)
		{
			node.right=null;
			node.left=null;
			node.ht=0;
			node.val=val;
			return node;
		}
		if(val<node.val)
			node =insertNode(node.left,val);
		if(val>node.val)
			node =insertNode(node.right,val);
		
		int balancefactor = calcBalanceFactor(node);
		if(balancefactor<-1)
		{
			if(calcBalanceFactor(node.right)>0)
			{
				node.right=rotateright(node.right);
				return rotateleft(node);
				
			}
			else
				return rotateleft(node);
		}
		else if(balancefactor>1)
		{
			if(calcBalanceFactor(node.left)<0)
			{
				//rotateLeft
				//rotateRight
			}
			else {
				//rotateright
			}
		}
		node.ht=calculateHeight(node)+1;
		return node;
		
	}
	
	static Node rotateleft(Node node)
	{
		Node y = node.right;
		node.right=y.left;
		y.left=node;
		y.ht=calculateHeight(y)+1;
		node.ht=calculateHeight(node)+1;
		return y;
	}
	static Node rotateright(Node node)
	{
		Node y=node.left;
		node.left=y.right;
		y.right=node;
		y.ht=calculateHeight(y)+1;
		node.ht=calculateHeight(node)+1;
		return y;
	}
	
	static int calcBalanceFactor(Node node)
	{
		int left=-1;
		int right=-1;
		if(node.left !=null)
			left = node.left.ht;
		if(node.right!=null)
			right = node.right.ht;
		return left=right;
			
		
	}
	
	static int calculateHeight(Node node)
	{
		int height=-1;
		if(node.left!=null)
		height= Math.max(height, node.left.ht);
		if(node.right!=null)
			height= Math.max(height, node.right.ht);
		
		return height;
	}

}
