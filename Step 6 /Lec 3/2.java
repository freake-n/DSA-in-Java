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
    public ListNode reverseList(ListNode head) {
        ListNode curr=head;
        ListNode prev=null;
        while(curr!=null)
        {
            ListNode temp=curr.next;
            curr.next=prev;
            // Move the previous node to the current node
            prev = curr;
            // Move to the next node in the original list
            curr = temp;
        }
        // At the end, prev will be the new head of the reversed list
        return prev;
    }
}
