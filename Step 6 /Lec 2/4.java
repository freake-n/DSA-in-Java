/*
class Node
{
    int data;
    Node next, prev;
    Node(int data)
    {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

*/
public static Node reverseDLL(Node  head)
{
    if(head==null || head.next==null)
        return head;
    
    Node current = head;
    Node temp = null;
    
    // Swap next and prev for all nodes of the doubly linked list
    while (current != null) {
        temp = current.prev;
        current.prev = current.next;
        current.next = temp;
        current = current.prev;  // Move to the next node (which is the previous node before swapping)
    }
    
    // Before changing head, check for the cases like empty list and
    // list with only one node
    if (temp != null) {
        head = temp.prev;
    }
    
    return head;
}
