/**
Problem statement:
  
Check whether a given number ’n’ is a palindrome number.

Note :
Palindrome numbers are the numbers that don't change when reversed.
You don’t need to print anything. Just implement the given function.

Example:
  
Input: 'n' = 51415
Output: true
Explanation: On reversing, 51415 gives 51415.
**/

import java.util.*;
public class Solution {
	
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int t=0,r=0,rev=0;
		t=n;
		while(t!=0){
			r=t%10;
			t=t/10;
			rev=rev*10+r;
		}
		if(n==rev)
			System.out.println("true");
		else
			System.out.println("false");
	}
}
