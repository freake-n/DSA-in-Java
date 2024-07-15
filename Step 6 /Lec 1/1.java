/*
class Node { 
    int data; 
    Node next; 

    Node() { data = 0; }
    Node(int d) { data = d; }  //constructor to create a new node
} 
*/

class Solution {
    static Node constructLL(int arr[]) {
        Node head=new Node(arr[0]);
        Node t=head;
        for(int i=1;i<arr.length;i++)
        {
            t.next=new Node(arr[i]);
            t=t.next;
        }
        t.next=null;
        return head;
    }
}
