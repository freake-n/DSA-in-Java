/*
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
*/


class Solution {
    // Function to insert a node at the end of the linked list.
    Node insertAtEnd(Node head, int x) {
        
        if (head == null){
            // If the given linked list in null then the given number becomes its one and only node
            head = new Node(x);
            return head;
        }
            
        Node t = head;
        while(t.next != null)
        {
            t=t.next;
        }
        t.next=new Node(x);
        return head;
    }
}
