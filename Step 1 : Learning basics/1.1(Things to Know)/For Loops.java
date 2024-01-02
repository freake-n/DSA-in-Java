/*
Problem statement:

The n-th term of Fibonacci series F(n), where F(n) is a function, is calculated using the following formula -

    F(n) = F(n - 1) + F(n - 2), 
    Where, F(1) = 1, F(2) = 1

Provided 'n' you have to find out the n-th Fibonacci Number. Handle edges cases like when 'n' = 1 or 'n' = 2 by using conditionals like if else and return what's expected.
"Indexing is start from 1"


Example :

Input: 6
Output: 8
Explanation: The number is ‘6’ so we have to find the “6th” Fibonacci number.
So by using the given formula of the Fibonacci series, we get the series:    
[ 1, 1, 2, 3, 5, 8, 13, 21]
So the “6th” element is “8” hence we get the output.
*/

import java.util.*;
public class Solution {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		int a=1,b=1,c=0;

		if(n==1 || n==2){
			System.out.println("1");
		}
		else{
			for(int i=2;i<n;i++)
			{
				c=a+b;
				a=b;
				b=c;
			}
			System.out.println(c);
		}	
	}
}
