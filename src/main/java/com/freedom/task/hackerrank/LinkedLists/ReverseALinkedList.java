package com.freedom.task.hackerrank.LinkedLists;

public class ReverseALinkedList {
	


    // Complete the reverse function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode reverse(SinglyLinkedListNode head) {
        SinglyLinkedListNode reverse = null;
        while(head.next!=null){
  if(reverse==null)
  reverse = new SinglyLinkedListNode(head.data);
  else{
      SinglyLinkedListNode temp = reverse;
      reverse = new SinglyLinkedListNode(head.data);
      reverse.next = temp;
  }
  head =head.next;

        }
   SinglyLinkedListNode temp = reverse;
      reverse = new SinglyLinkedListNode(head.data);
      reverse.next = temp;

      return reverse;

    }
    
public SinglyLinkedListNode reverseList(SinglyLinkedListNode head) {
        
	SinglyLinkedListNode newHead = null;
        
        while(head!=null)
        {
        	SinglyLinkedListNode next = head.next;
            head.next=newHead;
            newHead=head;
            head=next;
        }
        
        return newHead;
        
    }



}
