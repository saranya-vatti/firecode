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
    public static Boolean isCyclic(ListNode head) {
        if(head == null) return false;
        HashSet<Integer> set = new HashSet<>();
        while(head!=null) {
            if(set.contains(head.data)) return true;
            set.add(head.data);
            head = head.next;
        }
        return false;
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
	    ListNode l1 = new ListNode(2);
	    ListNode l2 = new ListNode(3);
	    ListNode l3 = new ListNode(4);
	    ListNode l4 = new ListNode(5);
	    ListNode l5 = new ListNode(6);
	    head.next = null; l1.next = l2; l2.next = l3; l3.next = l4; l4.next = l5;
	    System.out.println(isCyclic(head));
    }
}
