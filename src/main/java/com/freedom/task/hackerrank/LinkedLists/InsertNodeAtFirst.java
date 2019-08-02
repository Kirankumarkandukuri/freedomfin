package com.freedom.task.hackerrank.LinkedLists;

public class InsertNodeAtFirst {
	


    // Complete the insertNodeAtHead function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode insertNodeAtHead(SinglyLinkedListNode llist, int data) {
 if(llist == null){
 llist = new SinglyLinkedListNode(data);
 return llist;
 }
 else
 {
     SinglyLinkedListNode newl = new SinglyLinkedListNode(data);
     newl.next=llist;
     return newl;
 }

    }



}
