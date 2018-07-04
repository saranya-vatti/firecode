// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public ListNode deleteAtMiddle(ListNode head, int position) {
    if(head == null) return head;
    if(position == 1) return head.next;
    ListNode prev = head;
    ListNode curr = head.next;
    while(position--!= 2) {
        if(curr == null) return head;
        prev = curr;
        curr = curr.next;
    }
    prev.next = curr.next;
    return head;
}