package com.freedom.task.hackerrank;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;


class Node {
    Node next;
    int val;
    
    Node(int data) {
        this.val = data;
        next = null;
       
    }
}
class Solution1 {

	/* 
    
    class Node 
    	int data;
    	Node left;
    	Node right;
	*/
	
	
	public static void levelOrder(Node root) {
		
		
      
       
}
   

   
   

  
   public static String longestPalindrome(String s) {
       
       String st = null;
       for(int i=s.length();i>=1;i--)
       {
           st = getSubStrings(s,i);
           if(st!=null)
               return st;
       }
       return null;
   }
   
   public  static String getSubStrings(String s, int charcount)
   {
       String t=null;
       for(int i=0;i<s.length()-charcount+1;i++){
      t=  s.substring(i,charcount+i);
       if(isPalindrome(t))
       {
           return t;
       }
       }
       return null;
   }
   
   public  static String prefix()
   {

   	String[] strs = {"flowers","flat", "fling"};
       if (strs.length == 0) return "";
       String pre = strs[0];
       for (int i = 1; i < strs.length; i++)
           while(strs[i].indexOf(pre) != 0)
               pre = pre.substring(0,pre.length()-1);
       return pre;
   
   }
   
   public static boolean isPalindrome(String s)
   {
       char[] c = s.toCharArray();
       char[] d = new char[c.length];
       int j=0;
      for(int i=c.length-1;i>=0;i--)
      {
          d[j]=c[i];
          j++;
      }
       String t = new String(d);
       if(s.equals(t))
           return true;
       else return false;
   }

    public static void main(String[] args) {
    	int[] A= {1,1,1,1,1,7,7,8,8,10};
    	int target =1;

        int[] ret = {-1, -1};
    
    // the first binary search to find the left boundary
    int l = 0, r = A.length-1;
    while(l < r) {
        int mid = (l+r)/2;
        if (A[mid] < target)
            l = mid + 1;
        else
            r = mid;
    }
    
    // if target can not be found, return {-1, -1}
    if (A[l] != target)
    
    ret[0] = l;
    // second binary search to find the right boundary
    r = A.length-1;
    while(l < r) {
        // mid is calculated differently
        int mid = (l + r+1)/2;
        if (A[mid] > target)
            r = mid - 1;
        else
            l = mid;
    }
    ret[1] = l;
          
    }
    
public static Node reverseKGroup(Node head, int k) {
        
        int i=0;
        Node node= null;
        Node firstnode= null;
        Node returnNode =null;
        if(head == null|| head.next==null)
            return head;
            
        while(i<k&& head.next!=null)
        {
            if(firstnode==null)
            {
            firstnode=new Node(head.val);
                node=firstnode;
               
            }
            else
            {
                firstnode = new Node(head.val);
                firstnode.next=node;
                node=firstnode;
               
            }
            returnNode=firstnode;
            head=head.next;
            i++;
           
               
        }
        while(firstnode.next!=null)
        	firstnode=firstnode.next;
          
        firstnode.next=reverseKGroup( head,  k);
        
        return returnNode;
        
    }
    	
}