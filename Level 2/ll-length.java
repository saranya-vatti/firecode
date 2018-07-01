// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public Boolean isListEven(ListNode head) {
    int length = 0;
    while(head != null) {
        length++;
        head = head.next;
    }
    return length%2==0;
}