// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public DoublyLinkedNode deleteAtPos(DoublyLinkedNode head, int pos) {
    if(head == null) return null;
    if(pos == 1) return head.next;
    if(head.next == null) return head;
    DoublyLinkedNode curr = head;
    while(pos-->1) {
        if(curr == null) return head;
        curr = curr.next;
    }
    DoublyLinkedNode prev = curr.prev;
    prev.next = curr.next;
    if(prev.next != null) {
        prev.next.prev = prev;
    }
    return head;
}