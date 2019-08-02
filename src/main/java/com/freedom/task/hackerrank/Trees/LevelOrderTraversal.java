package com.freedom.task.hackerrank.Trees;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {
	


	/* 
    
    class Node 
    	int data;
    	Node left;
    	Node right;
	*/
	public static void levelOrder(Node root) {
        
        Queue queue = new LinkedList<>(); 
         System.out.print(root.data+ " ");
        
        queueNode(root.left,root.right);
      
       
    }

   static  void printRight(Queue queue)
    {  
       Queue nextQueue = new LinkedList<>();
       while(queue!=null&& !queue.isEmpty())
       {
           Node node =(Node) queue.peek();
           if(node.left!=null)
           {
               nextQueue.add(node.left);
           }
           if(node.right!=null)
           {
               nextQueue.add(node.right);
           }
           System.out.print(node.data+ " ");
           queue.remove();
       }
       if(!nextQueue.isEmpty())
       {
           printRight(nextQueue);
       }
      
    }
   
   static  void queueNode(Node left, Node right)
   {
              Queue queue = new LinkedList<>();
       if(left!=null)
       queue.add(left);
       if(right !=null)
       queue.add(right);
       printRight(queue);
   }
   



}
