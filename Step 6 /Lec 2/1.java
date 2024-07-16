/*
class Node {
    int data;
    Node next;
    Node prev;

    Node(int x) {
        data = x;
        next = null;
        prev = null;
    }
}
*/

class Solution {
    Node constructDLL(int arr[]) {
        Node head=new Node(arr[0]);
        Node temp=head;
        for(int i=1;i<arr.length;i++)
        {
            Node a=new Node(arr[i]);
            a.prev=temp;
            temp.next=a;
            temp=a;
        }
        return head;
    }
}
