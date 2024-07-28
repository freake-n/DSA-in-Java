// Applying sorting

/*
class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        next = null;
    }
}
*/

class Solution {
    // Function to sort a linked list of 0s, 1s and 2s.
    static Node segregate(Node head) {
        if(head==null || head.next==null)
            return head;
            
        Node mid=findMiddle(head);
        Node left=head;
        Node right=mid.next;
        mid.next=null;
        
        left=segregate(left);
        right=segregate(right);
        
        return merge(left,right);
    }
    
    private static Node findMiddle(Node head)
    {
        if(head==null)
            return head;
            
        Node slow=head;
        Node fast=head;
        
        while(fast.next!=null && fast.next.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        
        return slow;
    }
    
    private static Node merge(Node left, Node right)
    {
        Node temp=new Node(0);
        Node srt=temp;
        
        while(left!=null && right!=null)
        {
            if(left.data<right.data)
            {
                srt.next=left;
                left=left.next;
            }
            else
            {
                srt.next=right;
                right=right.next;
            }
            srt=srt.next;
        }
        
        if(left!=null)
            srt.next=left;
        else if(right!=null)
            srt.next=right;
            
        return temp.next;
    }
}






// Applying segregation using 3 different LLs then attaching them as per question

class Solution {
    // Function to sort a linked list of 0s, 1s and 2s.
    static Node segregate(Node head) {
        if (head == null || head.next == null) return head;

        // creating three dummy nodes to point to beginning of the linked lists.
        Node zeroD = new Node(0);
        Node oneD = new Node(0);
        Node twoD = new Node(0);

        // initializing current pointers for three lists.
        Node zero = zeroD, one = oneD, two = twoD;
        Node curr = head;

        // traversing over the list with a pointer.
        while (curr != null) {
            // we check data at current node and store the node in it's
            // respective list and update the link part of that list.
            if (curr.data == 0) {
                zero.next = curr;
                zero = zero.next;
                curr = curr.next;
            } else if (curr.data == 1) {
                one.next = curr;
                one = one.next;
                curr = curr.next;
            } else {
                two.next = curr;
                two = two.next;
                curr = curr.next;
            }
        }
        // attaching the three lists containing 0s,1s and 2s respectively.
        zero.next = (oneD.next != null) ? (oneD.next) : (twoD.next);
        one.next = twoD.next;
        two.next = null;

        // updating the head of the list.
        head = zeroD.next;
        return head;
    }
}
