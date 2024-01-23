/**
Problem statement :

You are given an integer ‘n’.
Function ‘sumOfDivisors(n)’ is defined as the sum of all divisors of ‘n’.
Find the sum of ‘sumOfDivisors(i)’ for all ‘i’ from 1 to ‘n’.

Example:

Input: ‘n’  = 5
Output: 21
Explanation:

We need to find the sum of ‘sumOfDivisors(i)’ for all ‘i’ from 1 to 5. 
‘sumOfDivisors(1)’ = 1
‘sumOfDivisors(2)’ = 2 + 1 = 3
‘sumOfDivisors(3)’ = 3 + 1 = 4
‘sumOfDivisors(4)’ = 4 + 2 +1 = 7 
‘sumOfDivisors(5)’ = 5 + 1 = 6
Therefore our answer is sumOfDivisors(1) + sumOfDivisors(2) + sumOfDivisors(3) + sumOfDivisors(4) + sumOfDivisors(5) = 1 + 3 + 4 + 7 + 6 = 21.
**/

public class Solution {
    public static int sumOfAllDivisors(int n) {
        int sum = 0;

        // Loop through divisors from 1 to sqrt(n)
        for (int i = 1; i <= Math.sqrt(n); i++) {
            
            // Calculate the contribution of divisors from i
            int t1 = i * (n / i - i + 1);

            // Calculate the contribution of divisors from n/i
            int t2 = (((n / i) * (n / i + 1)) / 2) - ((i * (i + 1)) / 2);

            // Add the contributions to the total sum
            sum = sum + t1 + t2;
        }

        return sum;
    }
}
