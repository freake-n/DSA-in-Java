//User function Template for Java

class Solution{
    Node removeDuplicates(Node head){
        if (head == null) 
            return null;

        Node current = head;
        
        while (current != null) {
            Node nextNode = current.next;
            
            // If the next node is a duplicate, remove it
            while (nextNode != null && nextNode.data == current.data) {
                nextNode = nextNode.next;
            }
            
            current.next = nextNode; // Link to the next non-duplicate node
            if (nextNode != null) {
                nextNode.prev = current; // Update previous pointer of the next non-duplicate node
            }
            
            current = nextNode; // Move to the next node in the list
        }
        
        return head;
    }
}
