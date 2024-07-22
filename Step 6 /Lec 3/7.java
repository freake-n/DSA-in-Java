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

//    1 -> 2 -> 2 -> 1     ==>     1 -> 2 -> 1 -> 2    (Changing the list to check half)

class Solution {
    public ListNode reverse(ListNode head) {
        ListNode prev=null; // Previous pointer
        ListNode agla=null; // Next pointer
        ListNode curr=head; // Current pointer
        while(curr!=null){          // Previous - Current - Next  
            agla=curr.next; 
            curr.next=prev;
            prev=curr;
            curr=agla;
        }
        return prev;
    }

    public boolean isPalindrome(ListNode head) {
        ListNode fast=head; 
        ListNode slow=head;
        while(fast.next!=null && fast.next.next!=null){     // Finding middle node (Left middle for even)
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode rev_right_half=reverse(slow.next); // Reversing the right half of the list
        slow.next=rev_right_half;   // Connecting the new reversed list after middle node
      
        ListNode p1=head; // First node
        ListNode p2=slow.next;  // First node after middle
      
        while(p2!=null){
            if(p1.val!=p2.val){     // If does not matches
                return false;
            }
            p1=p1.next;
            p2=p2.next;
        }
        return true;
    }
}
