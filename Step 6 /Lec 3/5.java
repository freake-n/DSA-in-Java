/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head==null || head.next==null){
            return null;
        }
        ListNode fast=head;
        ListNode slow=head;
        ListNode temp=head;
        while(fast!=null){
            if(slow==null){ 
                return null; 
            }
            slow=slow.next;
            if(fast==null || fast.next==null){
                return null; 
            }
            fast=fast.next.next;
            if(slow==fast){
                break;
            }
        }
        while(temp!=slow){
            if(temp==null || slow==null){
                return null;
            }
            temp=temp.next;
            slow=slow.next;
        }
        return slow;
    }
}
