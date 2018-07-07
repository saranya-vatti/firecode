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
    public static ListNode removeDuplicates(ListNode head) {
        if(head == null || head.next == null) return head;
        HashSet<Integer> set = new HashSet<>();
        ListNode prev = head;
        ListNode curr = head.next;
        set.add(prev.data);
        while(curr!=null) {
            if(!set.contains(curr.data)) {
                set.add(curr.data);
                prev.next = curr;
                prev = prev.next;
            }
            curr = curr.next;
        }
        prev.next = curr;
        return head;
    }
	public static void main(String[] args) {
	    ListNode head = new ListNode(1);
	    ListNode l1 = new ListNode(2);
	    ListNode l2 = new ListNode(2);
	    ListNode l3 = new ListNode(4);
	    ListNode l4 = new ListNode(5);
	    ListNode l5 = new ListNode(5);
	    head.next = l1; l1.next = l2; l2.next = l3; l3.next = l4; l4.next = l5;
	    ListNode head2 = removeDuplicates(head);
	    while(head2 != null) {
	        System.out.print(head2.data + "->");
	        head2 = head2.next;
	    }
	}
}
