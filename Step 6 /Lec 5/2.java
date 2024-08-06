/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode rotateRight(ListNode head, int k) {

        if(head==null || head.next==null)
            return head;

        ListNode t=head;
        int l=1;

        // Step 1: Calculate the length of the list
        while(t.next!=null)
        {
            t=t.next;
            l++;
        }

        // Step 2: Reduce k to a value within the range of the list length
        k=k%l;
        if(k==0)
            return head;

        // Step 3: Find the new head after rotation
        t.next = head; // Form a circular list
        
        for (int i = 0; i < l - k; i++) {
            t = t.next;
        }

        // Step 4: Break the circular list to form the rotated list
        head = t.next;
        t.next = null;

        return head;
    }
}
