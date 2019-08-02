package com.freedom.task.hackerrank.LinkedLists;

public class PrintInReverse {
	


    // Complete the reversePrint function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static void reversePrint(SinglyLinkedListNode head) {
        int count=0;
        SinglyLinkedListNode reverse = null;
        while(head.next!=null)
        {
            if(reverse==null)
            reverse =new SinglyLinkedListNode(head.data);
            else
            {
                SinglyLinkedListNode temp =reverse;
                reverse= new SinglyLinkedListNode(head.data);
                reverse.next=temp;
            }
            head = head.next;
        }
        System.out.println(head.data);
          while(reverse.next!=null)
        {
             System.out.println(reverse.data);
             if(reverse.next.next ==null)
              System.out.println(reverse.next.data);
              reverse=reverse.next;
        }


    }



}
