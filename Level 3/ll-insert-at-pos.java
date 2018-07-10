// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public ListNode insertAtPosition(ListNode head, int data, int pos) {
    ListNode newNode = new ListNode(data);
    if(head == null) return newNode;
    if(pos <= 1) {
        newNode.next = head;
        return newNode;
    }
    ListNode prev = head;
    ListNode curr = prev.next;
    while(pos-->2) {
        if(curr == null) {
            prev.next = newNode;
            return head;
        }
        prev = prev.next;
        curr = curr.next;
    }
    prev.next = newNode;
    newNode.next = curr;
    return head;
}