/**
Problem statement:
  
You are given a number ’n’.
Find the number of digits of ‘n’ that evenly divide ‘n’.

Note:
A digit evenly divides ‘n’ if it leaves no remainder when dividing ‘n’.


Example:
  
Input: ‘n’ = 336
Output: 3
Explanation:
336 is divisible by both ‘3’ and ‘6’. Since ‘3’ occurs twice it is counted two times.
**/

public class Solution {
    public static int countDigits(int n){
        int t=0,r=0,c=0;
        t=n;
        while(t!=0){
            r=t%10;
            t=t/10;
            if(r!=0 && n%r==0)
                c++;
        }
        return c;
    }
}
