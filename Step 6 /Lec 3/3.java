/*

Step-by-Step:
Initial Call: reverseList(1)
Recursive Call: reverseList(2)
Recursive Call: reverseList(3)
Recursive Call: reverseList(4)
Recursive Call: reverseList(5)
Yahan pe list 5 -> null ho jaayegi aur return ho jaayegi as new head.

Ab recursion waapas aayega aur pointers ko adjust karega:

4.next.next = 4 (Matlab, 5.next = 4)
4.next = null (Ab list 5 -> 4 -> null ho gayi)
Return new head 5
Next step:

3.next.next = 3 (Matlab, 4.next = 3)
3.next = null (Ab list 5 -> 4 -> 3 -> null ho gayi)
Return new head 5
Isi tarah recursion waapas aata rahega aur list reverse hoti rahegi:

2.next.next = 2 (Matlab, 3.next = 2)
2.next = null (Ab list 5 -> 4 -> 3 -> 2 -> null ho gayi)
Return new head 5
Finally:

1.next.next = 1 (Matlab, 2.next = 1)
1.next = null (Ab list 5 -> 4 -> 3 -> 2 -> 1 -> null ho gayi)
Return new head 5
Final Reversed List:
5 -> 4 -> 3 -> 2 -> 1

*/


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
        if (head == null || head.next == null) {
            return head;
        }
        
        ListNode newHead = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        
        return newHead;
        }
}
