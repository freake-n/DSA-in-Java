/**
Problem statement:
  
You are given two integers 'n', and 'm'.
Calculate 'gcd(n,m)', without using library functions.

Note:
The greatest common divisor (gcd) of two numbers 'n' and 'm' is the largest positive number that divides both 'n' and 'm' without leaving a remainder.


Example:
  
Input: 'n' = 6, 'm' = 4
Output: 2
Explanation:
Here, gcd(4,6) = 2, because 2 is the largest positive integer that divides both 4 and 6.

  
Try to solve this in O(log(n)) 

Constraints:
0 <= ‘n’ <= 10^5

Time Limit: 1 sec
**/

// Approach 1 : O(n)

public class Solution {
    public static int calcGCD(int n, int m){
        int gcd=0;
        for(int i=1;i<=n;i++){
            if(n%i==0 && m%i==0)
                gcd=i;
        }
        return gcd;
    }
}

// Approach 2 : O(log(min(a, b)))

public class Solution {
    public static int calcGCD(int n, int m){
        while (m != 0) {
            int temp = m;
            m = n % m;
            n = temp;
        }
        return n;
    }
}
