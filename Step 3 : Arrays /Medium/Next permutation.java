/*

A permutation of an array of integers is an arrangement of its members into a sequence or linear order.

For example, for arr = [1,2,3], the following are all the permutations of arr: [1,2,3], [1,3,2], [2, 1, 3], [2, 3, 1], [3,1,2], [3,2,1].
The next permutation of an array of integers is the next lexicographically greater permutation of its integer. More formally, if all the permutations of the array are sorted in one container according to their lexicographical order, then the next permutation of that array is the permutation that follows it in the sorted container. If such arrangement is not possible, the array must be rearranged as the lowest possible order (i.e., sorted in ascending order).

For example, the next permutation of arr = [1,2,3] is [1,3,2].
Similarly, the next permutation of arr = [2,3,1] is [3,1,2].
While the next permutation of arr = [3,2,1] is [1,2,3] because [3,2,1] does not have a lexicographical larger rearrangement.
Given an array of integers nums, find the next permutation of nums.

The replacement must be in place and use only constant extra memory.

 

Example 1:

Input: nums = [1,2,3]
Output: [1,3,2]

*/


class Solution {

    private void swap(int[] nums,int i,int j)   // Helper function for swapping
    {
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }

    private void reverse(int[] nums,int start)  // Helper function for array reverse
    {
        int i=start;
        int j=nums.length-1;
        while(i<j){
            swap(nums,i,j);
            i++;
            j--;
        }
    }

    public void nextPermutation(int[] nums) {
        int idx=-1;

        for(int i=nums.length-2;i>=0;i--)
        {
            if(nums[i]<nums[i+1])
            {
                idx=i;  // Index of the number that is lesser than its next number
                break;
            }
        }

        // If no such number exists then it means its the last in lexicographical order
        if(idx==-1){    
            reverse(nums,0);
        }
        else
        {
            for(int i=nums.length-1;i>idx;i--)
            {
                if(nums[i]>nums[idx]){  // Finding the number thats just bigger than the number at index
                    swap(nums,i,idx);
                    break;
                }
            }
            
            // Reverse the rest part of array in increasing order for the next permutation
            reverse(nums,idx+1);    
        }
    }
}
