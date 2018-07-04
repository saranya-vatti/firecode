import java.util.*;
import java.util.streams.*;

class ListNode {
    int data;
    ListNode next;        
    ListNode(int data) { this.data = data; }
}
public class Main {
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

    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);
    /* Declare second integer, double, and String variables. */
        int j;
        double e;
        String t;

        /* Read and save an integer, double, and String to your variables.*/
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.
        j=Integer.parseInt(scan.nextLine());
        e=Double.parseDouble(scan.nextLine());
        t=scan.nextLine();

        /* Print the sum of both integer variables on a new line. */
        System.out.println(i+j);
        System.out.println(d+e);
        System.out.println(s+t);

        /* Print the sum of the double variables on a new line. */

        /* Concatenate and print the String variables on a new line;
        	the 's' variable above should be printed first. */
        scan.close();
    }
}