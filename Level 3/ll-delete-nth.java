// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

class ListNode {
    int data;
    ListNode next;        
    ListNode(int data) { this.data = data; }
 } 
public ListNode removeNthFromEnd(ListNode head, int n) {
    if(head == null) return head;
    ListNode curr = head;
    int len = 0;
    int dataToDelete = 0;
    while(curr!=null) {
        curr = curr.next;
        len++;
    }
    if(n>len || n<1) return head;
    curr=head;
    int length=len;
    int pos=0;
    int toDel = len - n;
    while(toDel != pos++) {
        curr = curr.next;
        if(curr == null) return head;
    }
    curr.next=curr.next.next; 
    return head;
}

public static void main()