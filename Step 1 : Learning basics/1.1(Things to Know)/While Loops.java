/*
Problem statement:

Write a program to input an integer 'n' and print the sum of all its even digits and the sum of all its odd digits separately.

Digits mean numbers, not places! That is, if the given integer is "132456", even digits are 2, 4, and 6, and odd digits are 1, 3, and 5.

Constraints
0<= 'n' <=10000


Example :

Input: 'n' = 132456
Output: 12 9

Explanation:
The sum of even digits = 2 + 4 + 6 = 12
The sum of odd digits = 1 + 3 + 5 = 9
*/

import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		int r=1,e=0,o=0;

		while(n!=0)
		{
			r=n%10;
			n=n/10;
			if(r%2==0){
				e=e+r;
			}
			else{
				o=o+r;
			}
		}

		System.out.println(e+" "+o);

	}
}
