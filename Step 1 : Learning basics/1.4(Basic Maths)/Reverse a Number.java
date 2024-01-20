/**
Problem statement:
  
There is a song concert going to happen in the city. The price of each ticket is equal to the number obtained after reversing the bits of a given 32 bits unsigned integer ‘n’.

Sample Input 1 :
2
0
12
  
Sample Output 1:
0
805306368

Explanation For Sample Input 1 :

For the first test case :
Since the given number N = 0 is represented as 00000000000000000000000000000000 in its binary representation. So after reversing the bits, it will become 00000000000000000000000000000000 which is equal to 0 only. 
So the output is 0.     

For the second test case :
Since the given number N = 12 is represented as 00000000000000000000000000001100 in its binary representation. So after reversing the bits, it will become 0110000000000000000000000000000, which is equal to 805306368 only. 
So the output is 805306368.
**/

public class Solution {
	public static long reverseBits(long n) {
		// Convert decimal to 32-bit binary string
    String b = String.format("%32s", Long.toBinaryString(n)).replace(' ', '0');
		String str="";
		char ch;
		for(int i=b.length()-1;i>=0;i--){
			ch=b.charAt(i);
			str=str+ch;
		}
		long ticket = Long.parseLong(str, 2);
		return ticket;
	}
}
