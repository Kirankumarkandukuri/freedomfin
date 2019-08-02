package com.freedom.task.hackerrank.LinkedLists;

public class DeleteDuplicateValuesFromNode {


    // Complete the removeDuplicates function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode removeDuplicates(SinglyLinkedListNode head) {
   int max=0;
   SinglyLinkedListNode temp =head;
   SinglyLinkedListNode previous=null;
        while(head.next !=null){
          
          if(head.data ==head.next.data ){
              if(head.next !=null){
              head.next=head.next.next;
              }   
          }
          else
          {
               head =head.next;
            if(head ==null)
            break;
          }
        }
        
        return temp;


    }



}
