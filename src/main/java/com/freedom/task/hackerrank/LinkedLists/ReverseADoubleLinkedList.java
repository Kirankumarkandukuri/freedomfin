package com.freedom.task.hackerrank.LinkedLists;

public class ReverseADoubleLinkedList {
	


    // Complete the reverse function below.

    /*
     * For your reference:
     *
     * DoublyLinkedListNode {
     *     int data;
     *     DoublyLinkedListNode next;
     *     DoublyLinkedListNode prev;
     * }
     *
     */
    static DoublyLinkedListNode reverse(DoublyLinkedListNode head) {
        DoublyLinkedListNode r = null;
        DoublyLinkedListNode temp =null;
        while(head.next!=null)
        {
              temp = new DoublyLinkedListNode(head.data);
              if(r!=null)
              {
              temp.next=r;
              r.prev=temp;
              temp.prev=null;
              r=temp;
              }
              else{
                  temp.next=null;
                  temp.prev=null;
                  r=temp;
              }
            head=head.next;
          
        }
       
       temp = new DoublyLinkedListNode(head.data);
         if(r!=null)
              {
              temp.next=r;
              r.prev=temp;
              temp.prev=null;
              r=temp;
              }
              else{
                  temp.next=null;
                  temp.prev=null;
                  r=temp;
              }
        return r;


    }



}
