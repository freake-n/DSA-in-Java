/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode tempA=headA;
        ListNode tempB=headB;
        int ca=0,cb=0; // Counters for both the list

        while(tempA!=null){
            ca++;
            tempA=tempA.next;
        }
        tempA=headA;
        while(tempB!=null){
            cb++;
            tempB=tempB.next;
        }
        tempB=headB;

        if(ca>cb){      // making both at same position
            for(int i=1;i<=(ca-cb);i++){
                tempA=tempA.next;
            }
        }
        else{
            for(int i=1;i<=(cb-ca);i++){
                tempB=tempB.next;
            }
        }

        while(tempA!=tempB){
            tempA=tempA.next;
            tempB=tempB.next;
        }
        
        return tempA;
    }
}
