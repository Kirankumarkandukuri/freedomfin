package com.freedom.task.leetcode.LinkedLists;

import java.util.Comparator;
import java.util.PriorityQueue;

class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
 }
public class MergeKSortedLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
	}
	
	 public ListNode mergeKLists(ListNode[] lists) {
	        
	        if(lists==null || lists.length==0) return null;
	        
	        PriorityQueue<ListNode> queue = new PriorityQueue(lists.length, new Comparator<ListNode>()
	                    {
	                        @Override
	                        public int compare(ListNode l1, ListNode l2)
	                        {
	                            if(l1.val<l2.val)
	                                return -1;
	                                else if(l1.val==l2.val)
	                                    return 0;
	                            else return 1;
	                        }
	                                                              
	                                                          });
	        
	        ListNode dummy = new ListNode(0);
	        ListNode tail = dummy;
	        for(ListNode node:lists)
	        {
	            queue.add(node);
	        }
	        while (!queue.isEmpty()){
	            tail.next=queue.poll();
	            tail=tail.next;
	            
	            if (tail.next!=null)
	                queue.add(tail.next);
	        }
	        return dummy.next;
	   

}
}
