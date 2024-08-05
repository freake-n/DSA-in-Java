/*

Definition for singly Link List Node
class Node
{
    int data;
    Node next,prev;
    
    Node(int x){
        data = x;
        next = null;
        prev = null;
    }
}

You can also use the following for printing the link list.
Node.printList(Node node);
*/

class Solution {
    public static ArrayList<ArrayList<Integer>> findPairsWithGivenSum(int target, Node head) {
        
        // List of List
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        
        if (head == null) 
            return result;
        
        // Initialize two pointers
        Node left = head;
        Node right = head;
        
        // Move right to the end of the list
        while (right.next != null) {
            right = right.next;
        }
        
        // Use the two-pointer technique to find pairs
        while (left != null && right != null && left != right && left.prev != right) 
        {
            int sum = left.data + right.data;
            
            if (sum == target) 
            {
                ArrayList<Integer> pair = new ArrayList<>();
                pair.add(left.data);
                pair.add(right.data);
                result.add(pair);
                
                // Move both pointers inward
                left = left.next;
                right = right.prev;
            } 
            
            else if (sum < target) {
                // Move the left pointer to the right
                left = left.next;
            } 
            
            else {
                // Move the right pointer to the left
                right = right.prev;
            }
        }
        
        return result;
    }
}
