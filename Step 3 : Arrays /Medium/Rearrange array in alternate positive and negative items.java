/*

You are given a 0-indexed integer array nums of even length consisting of an equal number of positive and negative integers.

You should return the array of nums such that the the array follows the given conditions:

Every consecutive pair of integers have opposite signs.
For all integers with the same sign, the order in which they were present in nums is preserved.
The rearranged array begins with a positive integer.
Return the modified array after rearranging the elements to satisfy the aforementioned conditions.

 

Example 1:

Input: nums = [3,1,-2,-5,2,-4]
Output: [3,-2,1,-5,2,-4]
Explanation:
The positive integers in nums are [3,1,2]. The negative integers are [-2,-5,-4].
The only possible way to rearrange them such that they satisfy all conditions is [3,-2,1,-5,2,-4].
Other ways such as [1,-2,2,-5,3,-4], [3,1,2,-2,-5,-4], [-2,3,-5,1,-4,2] are incorrect because they do not satisfy one or more conditions. 

*/


class Solution {
    public int[] rearrangeArray(int[] nums) {
        int len=nums.length/2;
        int p[]=new int[len];   // Creating seperate array for positive
        int n[]=new int[len];   // Creating seperate array for negative
        int a=0,b=0;

        for(int i=0;i<nums.length;i++)  // Seperating +ve and -ve in their arrays
        {
            if(nums[i]>0)
                p[a++]=nums[i];
            else
                n[b++]=nums[i];
        }

        a=0;
        b=0;

        // Arranging the integers with every consecutive pair of integers have opposite signs
        for(int i=0;i<nums.length;i++)  
        {
            if(i%2==0)
                nums[i]=p[a++];
            else
                nums[i]=n[b++];
        }
        return nums;
    }
}





                                                                    // ------------ OR -------------






class Solution {
    public int[] rearrangeArray(int[] nums) {
        int x=0,y=1;
        int[] res=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                res[x]=nums[i];
                x+=2;
            }else{
                res[y]=nums[i];
                y+=2;
            }
        }
        return res;
    }
}
