package com.freedom.task.hackerrank.LinkedLists;

class SinglyLinkedListNode {
    public SinglyLinkedListNode(int data2) {
		// TODO Auto-generated constructor stub
	}
	int data;
      SinglyLinkedListNode next;
}
public class InsertNodeAtEnd {



    // Complete the insertNodeAtTail function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data) {
        SinglyLinkedListNode actualHead = head;
        if(actualHead ==null){
            head = new SinglyLinkedListNode(data);
            return head;
        } else
 while(actualHead.next !=null){
    
     actualHead = actualHead.next;
 }
 actualHead.next= new SinglyLinkedListNode(data);
 return head;
    }


}
