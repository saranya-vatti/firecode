import java.util.*;
class ListNode {
    int data;
    ListNode next;        
    ListNode(int data) { this.data = data; }
}
public class Main
{
    public static ListNode findNthNodeFromEnd(ListNode head, int n) {
        if(head == null || n <= 0) return null;
        int len = 0;
        ListNode curr = head;
        while(curr != null) {
            curr = curr.next;
            len++;
        }
        if(n==len) return head;
        if(n>len) return null;
        ListNode daNode = head;
        int posFromLast = len;
        while(posFromLast-->n && daNode != null) {
            daNode = daNode.next;
        }
        return daNode;
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
	    ListNode l1 = new ListNode(2);
	    ListNode l2 = new ListNode(3);
	    ListNode l3 = new ListNode(4);
	    ListNode l4 = new ListNode(5);
	    ListNode l5 = new ListNode(6);
	    head.next = l1; l1.next = l2; l2.next = l3; l3.next = null; l4.next = l5;
	    System.out.println(findNthNodeFromEnd(head, 10).data);
    }
}
