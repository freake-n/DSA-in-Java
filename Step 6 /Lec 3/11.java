// Using MERGE SORT

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
    public ListNode sortList(ListNode head) {
        // Base case: Agar list khatam ho gayi ya sirf ek node hai, toh return kar do
        if (head == null || head.next == null) {
            return head;
        }
        
        // Middle element ko find karo
        ListNode mid = getMiddle(head);
        ListNode left = head;
        ListNode right = mid.next;
        mid.next = null; // Split the list into two halves
        
        // Recursively sort both halves
        left = sortList(left);
        right = sortList(right);
        
        // Merge the sorted halves
        return merge(left, right);
    }

    // Function to find the middle element of the list
    private ListNode getMiddle(ListNode head) {
        if (head == null) {
            return head;
        }
        
        ListNode slow = head, fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    // Function to merge two sorted lists
    private ListNode merge(ListNode left, ListNode right) {
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        
        while (left != null && right != null) {
            if (left.val < right.val) {
                tail.next = left;
                left = left.next;
            } else {
                tail.next = right;
                right = right.next;
            }
            tail = tail.next;
        }
        
        // If there are remaining nodes in either list, append them
        if (left != null) {
            tail.next = left;
        } else {
            tail.next = right;
        }
        
        return dummy.next;
    }
}




// Using QUICK SORT

class Solution {
    public ListNode sortList(ListNode head) {
        // Quicksort function call karte hain with head aur null tail ke saath
        return quickSort(head, null);
    }

    // QuickSort function jo linked list ko sort karta hai
    public static ListNode quickSort(ListNode head, ListNode tail) {
        // Base case: Agar list empty hai, ek hi node hai, ya head tail ke equal hai, to wahi return kar do
        if (head == null || head.next == null || head == tail) {
            return head;
        }

        boolean sorted = true; // List sorted hai ya nahi
        ListNode pivot = head, prev = head, curr = head.next; // Pivot ko head set karte hain, prev ko head, aur curr ko head.next

        // List ko traverse karte hain pivot se compare karne ke liye
        while (curr != null && curr != tail) {
            ListNode next = curr.next; // curr ka next save karte hain
            if (curr.val < pivot.val) {
                // Agar curr ka value pivot se chota hai
                sorted = false; // List ab tak sorted nahi hai
                curr.next = head; // curr ko head ke pehle place karte hain
                head = curr; // curr ko new head bana dete hain
                prev.next = next; // prev ka next update karte hain
            } else {
                // Agar curr ka value pivot se bada ya equal hai
                if (curr.val < prev.val) {
                    sorted = false; // List ab tak sorted nahi hai
                }
                prev = curr; // prev ko curr pe move karte hain
            }
            curr = next; // curr ko next node pe move karte hain
        }

        // Agar list sorted hai, to head return kar do
        if (sorted) {
            return head;
        }

        // Right half ko recursively sort karte hain
        pivot.next = quickSort(pivot.next, tail);

        // Left half ko recursively sort karte hain
        return quickSort(head, pivot);
    }
}
