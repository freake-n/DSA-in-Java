/**
Problem statement:

You are given an integer ‘n’.
Your task is to return an array containing integers from 1 to ‘n’ (in increasing order) without using loops.

Example:

Input: ‘n’ = 5
Output: 1 2 3 4 5
Explanation: An array containing integers from ‘1’ to ‘n’ is [1, 2, 3, 4, 5].
**/

public class Solution {

    public static int[] printNos(int x) {
       int arr [] = new int[x];
       OneToN(arr,x);
       return arr;
    }

   static void OneToN(int arr[],int x)
    {
        if(x<=0)
        {
            return;
        }
        arr[x-1] = x;
        OneToN(arr,x-1);
    }

}
