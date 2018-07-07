// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public ListNode deleteAtHead(ListNode head) {
    if(head == null || head.data == head.next.data) return null;
    int headData = head.data;
    while(head.next.data != headData) {
        head = head.next;
    }
    head.next = head.next.next;
    return head.next;
}