/******************************************************************************

                            Online Java Debugger.
                Code, Run and Debug Java program online.
Write your code in this editor and press "Debug" button to debug program.

*******************************************************************************/
import java.util.*;

class ListNode {
    int data;
    ListNode next;        
    ListNode(int data) { this.data = data; }
}  

public class Main
{
    public static ListNode deleteAtMiddle(ListNode head, int position) {
        if(head == null) return null;
        if(position <= 0) return head;
        if(position == 1) return head.next;
        position--;
        ListNode prev = head;
        ListNode curr = head.next;
        while(position-->1 && prev != null && curr != null) {
            prev = prev.next;
            curr = curr.next;
        }
        if(prev == null) return head;
        else if(curr == null) prev.next = curr;
        else prev.next = curr.next;
        return head;
    }
	public static void main(String[] args) {
	    ListNode head = new ListNode(1);
	    ListNode l1 = new ListNode(2);
	    ListNode l2 = new ListNode(3);
	    ListNode l3 = new ListNode(4);
	    ListNode l4 = new ListNode(5);
	    ListNode l5 = new ListNode(6);
	    ListNode l6 = new ListNode(7);
	    ListNode l7 = new ListNode(8);
	    ListNode l8 = new ListNode(9);
	    head.next = l1; l1.next = l2;
	    l2.next = l3; l3.next = l4;
	    l4.next = l5; l5.next = l6;
	    l6.next = l7; l7.next = l8;
	    ListNode newHead = deleteAtMiddle(head, 11);
	    while(newHead != null) {
	        System.out.print(newHead.data + "->");
	        newHead = newHead.next;
	    }
	    System.out.println();
	}
}
