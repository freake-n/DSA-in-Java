/* Structure of Doubly Linked List
class Node
{
	int data;
	Node next;
	Node prev;
	Node(int data)
	{
	    this.data = data;
	    next = prev = null;
	}
}
*/

class Solution {
    static Node deleteAllOccurOfX(Node head, int x) {
        // Handle the case where the head nodes have the value x
        while (head != null && head.data == x) {
            head = head.next;
        }

        Node current = head;

        while (current != null) {
            if (current.data == x) {
                // Bypass the node
                
                // If current.prev is not null, set its next to current.next
                if (current.prev != null) {
                    current.prev.next = current.next;
                }
                
                // If current.next is not null, set its prev to current.prev
                if (current.next != null) {
                    current.next.prev = current.prev;
                }
            }
            current = current.next;
        }

        return head;
    }
}
