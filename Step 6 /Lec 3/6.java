/*

class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
}

*/

//Function should return the length of the loop in LL.

class Solution
{
    //Function to find the length of a loop in the linked list.
    static int countNodesinLoop(Node head)
    {
        if (head == null || head.next == null) {
            return 0;
        }

        Node slow = head;
        Node fast = head;

        // Detect cycle using Floyd's Cycle-Finding Algorithm
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                // Cycle detected, now count the length of the cycle
                return countLoopLength(slow);
            }
        }

        // No cycle found
        return 0;
    }

    // Helper function to count the number of nodes in the loop
    static int countLoopLength(Node loopNode) {
        int count = 1;
        Node temp = loopNode;

        while (temp.next != loopNode) {
            count++;
            temp = temp.next;
        }

        return count;
    }
}
