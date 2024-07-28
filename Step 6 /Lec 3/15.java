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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        // Creating dummy node for the new linked list
        ListNode s=new ListNode(0);
        ListNode temp=s;

        int carry=0,sum=0;

        while (l1 != null || l2 != null) 
        {
            sum = carry;

            // If 1st list is not null
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }

            // If 2nd list is not null
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            // If sum is greater than 10 then take carry as 1
            carry = (sum >= 10) ? 1 : 0;
            // Taking only the last digit in sum 
			      sum = sum % 10;

            // Adding to new resultant list
            temp.next=new ListNode(sum);
            temp=temp.next;
        }

        // If some carry remains
        if (carry > 0)
			    temp.next = new ListNode(carry);

        return s.next; // Since the 1st node of the resultant list is a dummy value -> 0
    }
}
