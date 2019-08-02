package com.freedom.task.hackerrank.LinkedLists;

class DoublyLinkedListNode {
    public DoublyLinkedListNode(int data2) {
	// TODO Auto-generated constructor stub
}
	int data;
    DoublyLinkedListNode next;
   DoublyLinkedListNode prev;
}
public class InsertANodeIntoDoubleLinkedLIst {
	


    // Complete the sortedInsert function below.

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
    static DoublyLinkedListNode sortedInsert(DoublyLinkedListNode head, int data) {
      DoublyLinkedListNode node = new DoublyLinkedListNode(data);
     
    if (head == null && head.next == null) {
        node.prev = head;
        node.next = head.next;
        head.next = node;
        return head;
    }
     if(node.data<head.data)
     {
         node.next=head;
         head.prev=node;
         return node;
     }
    DoublyLinkedListNode fast = head;
    while (fast.next != null && node.data > fast.next.data) {
        fast = fast.next;
    }
    if (fast.next == null) {
        fast.next = node;
        node.prev = fast;
        node.next = null;
    } else {
        DoublyLinkedListNode next = fast.next;
        fast.next = node;
        node.prev = fast;
        node.next = next;
        next.prev = node;
    }
    return head; 
      
      
  }
    
    



}
