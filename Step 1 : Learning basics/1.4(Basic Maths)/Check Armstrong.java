/**
Problem statement:

You are given an integer 'n'.
Return 'true' if 'n' is an Armstrong number, and 'false' otherwise.

Note:
An Armstrong number is a number (with 'k' digits) such that the sum of its digits raised to 'kth' power is equal to the number itself. For example, 371 is an Armstrong number because 3^3 + 7^3 + 1^3 = 371.


Example:

Input: 'n' = 1634
Output: true
Explanation:
1634 is an Armstrong number, as 1^4 + 6^4 + 3^4 + 4^4 = 1634
**/

import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);

		int n,d,t,r,a=0;
		
		n=in.nextInt();
		t=n;
		String s=""+n;
		d=s.length();

		while(t!=0){
			r=t%10;
			t=t/10;
			a=a+(int)Math.pow(r,d);
		}

		if(a==n)
			System.out.println("true");
		else
			System.out.println("false");

	}
}
