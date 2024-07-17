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
}*/

class GfG
{
    //Function to insert a new node at given position in doubly linked list.
    void addNode(Node head_ref, int pos, int data)
	{
		Node temp=head_ref;
		for(int i=0;i<pos;i++)
		{
		    temp=temp.next;
		}
		Node n=new Node(data);
		n.next=temp.next;
		n.prev=temp;
		temp.next=n;
	}
}
