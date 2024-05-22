// Brute Force Approach O(n^3)

class Solution {
    public int maxSubArray(int[] nums) {
        int msum=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i;j<nums.length;j++)
            {
                int s=0;
                for(int k=i;k<=j;k++)
                {
                   s=s+nums[k]; 
                }
                if(s>msum)
                    msum=s;
            }
        }
        return msum;
    }
}


// Optimal Approach O(n)

class Solution {
    public int maxSubArray(int[] nums) {
        int msum=Integer.MIN_VALUE,sum=0;
        for(int i=0;i<nums.length;i++)
        {
            sum=sum+nums[i];

            if(sum>msum)
               msum=sum;
            
            if(sum<0)  // If at any point current sum becomes negative then make it zero and contunue with the adding process
                sum=0;
        }
        return msum;
    }
}
