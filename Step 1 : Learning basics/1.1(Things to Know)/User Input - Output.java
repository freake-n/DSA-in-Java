/*
Problem statement : 
  
Write a program that takes a character as input and prints 1, 0, or -1 according to the following rules.
  
1, if the character is an uppercase alphabet (A - Z).
0, if the character is a lowercase alphabet (a - z).
-1, if the character is not an alphabet.


Example:
  
Input: The character is 'a'.
Output: 0
Explanation: The input character is lowercase, so our answer is 0.
*/

import java.util.*;

public class Solution {
    
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        char ch = in.next().charAt(0);

        if ((ch >= 'A' && ch <= 'Z')) {
            System.out.println("1");
        } else if (ch >= 'a' && ch <= 'z') {
            System.out.println("0");
        } else {
            System.out.println("-1");
        }

    }
}
