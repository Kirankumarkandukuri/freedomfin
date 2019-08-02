package com.freedom.task.hackerrank.LinkedLists;

public class DeleteANode {


    // Complete the deleteNode function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode deleteNode(SinglyLinkedListNode head, int position) {
        SinglyLinkedListNode temp =head;
 int currentpos=0;

 if(position==0){
     temp =head.next;
     return temp;
 }
 while(head.next !=null)
 {
     if(currentpos==position-1)
     {
if(head.next.next!=null){
         head.next=head.next.next;
          return temp;}
         else{
         head.next =null;
          return temp;}
         
     }
     head=head.next;
     currentpos++;
 }
 return temp;
    }



}
