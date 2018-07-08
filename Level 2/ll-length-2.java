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
    public static Boolean isListEven(ListNode head) {
        int len = 0;
        while(head!=null) {
            head = head.next;
            len++;
        }
        return len%2==0;
    }
	public static void main(String[] args) {
	    ListNode head = new ListNode(1);
	    ListNode l1 = new ListNode(2);
	    ListNode l2 = new ListNode(3);
	    ListNode l3 = new ListNode(4);
	    ListNode l4 = new ListNode(5);
	    ListNode l5 = new ListNode(6);
	    head.next = l1; l1.next = l2; l2.next = l3; l3.next = l4; l4.next = null;
	    System.out.println(isListEven(head));
	}
}
