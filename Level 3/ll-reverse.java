// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public ListNode reverseList(ListNode head) {
    if(head == null) return null;
    ListNode prev = null;
    while(head != null) {
        ListNode next = head.next;
        head.next = prev;
        prev = head;
        head = next;
    }
    return prev;
}