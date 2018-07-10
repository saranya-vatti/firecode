import java.util.*;

class ListNode {
    int data;
    ListNode next;        
    ListNode(int data) { this.data = data; }
}  

public class Main
{
    public static Boolean isListPalindrome(ListNode head) {
        if(head == null || head.next == null) return true;
        Stack<Integer> st = new Stack<>();
        ListNode curr = head;
        while(curr != null) {
            st.add(curr.data);
            curr = curr.next;
        }
        curr = head;
        System.out.println(Arrays.toString(st.toArray()));
        while(!st.isEmpty()) {
            if(st.pop() != curr.data) return false;
            curr = curr.next;
        }
        return true;
    }
	public static void main(String[] args) {
	    ListNode head = new ListNode(1);
	    ListNode l1 = new ListNode(2);
	    ListNode l2 = new ListNode(1);
	    ListNode l3 = new ListNode(4);
	    ListNode l4 = new ListNode(5);
	    ListNode l5 = new ListNode(6);
	    ListNode l6 = new ListNode(7);
	    ListNode l7 = new ListNode(8);
	    ListNode l8 = new ListNode(9);
	    head.next = l1; l1.next = l2;
	    /*l2.next = l3; l3.next = l4;
	    l4.next = l5; l5.next = l6;
	    l6.next = l7; l7.next = l8;*/
	    System.out.println(isListPalindrome(head));
	}
}
