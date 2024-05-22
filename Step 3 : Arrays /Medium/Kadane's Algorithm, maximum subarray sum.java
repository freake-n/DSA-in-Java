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

// Using Kadane's Algorithm
class Solution {
    public int maxSubArray(int[] nums) {
        // Initialize the maximum sum to the smallest possible integer value
        int msum = Integer.MIN_VALUE;
        // Initialize the current sum to 0
        int sum = 0;

        // Iterate through each element in the array
        for (int i = 0; i < nums.length; i++) {
            // Add the current element to the current sum
            sum = sum + nums[i];

            // Update the maximum sum if the current sum is greater than the current maximum sum
            if (sum > msum) {
                msum = sum;
            }

            // If the current sum becomes negative, reset it to 0
            // This is because a negative sum would decrease the overall sum of any subsequent subarray
            if (sum < 0) {
                sum = 0;
            }
        }

        // Return the maximum sum found
        return msum;
    }
}
