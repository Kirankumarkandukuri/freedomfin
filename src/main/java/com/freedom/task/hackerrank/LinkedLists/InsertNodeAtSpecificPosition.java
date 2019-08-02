package com.freedom.task.hackerrank.LinkedLists;

public class InsertNodeAtSpecificPosition {
	


    // Complete the insertNodeAtPosition function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode head, int data, int position) {
        SinglyLinkedListNode temp = head;
 int check=0;
 if(head == null)
{
    return new SinglyLinkedListNode(data);
}

 while(head.next !=null){
     check++;
     if(check==position){
         if(head.next!=null){
         SinglyLinkedListNode next1 = head.next;
         SinglyLinkedListNode node =new SinglyLinkedListNode(data);
         node.next = next1;
        
         head.next = node;
         return temp;
         }
         else{
             head.next=new SinglyLinkedListNode(data);
             return head;
         }
     }
     else{
         head = head.next;
     }
      
 }
 return temp;
    }



}
