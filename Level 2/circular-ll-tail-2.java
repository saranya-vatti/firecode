// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public ListNode deleteAtTail(ListNode head) {
    if(head == null || head.next.data == head.data) return null;
    ListNode prev = head;
    ListNode curr = head.next;
    while(curr.next.data != head.data) {
        prev = prev.next;
        curr = curr.next;
    }
    prev.next = curr.next;
    return head;
}