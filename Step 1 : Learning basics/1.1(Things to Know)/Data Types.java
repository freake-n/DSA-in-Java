/*
Problem statement
  
Data type refers to the type of value a variable has and the way the computer interprets it.
Each data type has a different size. You’ve studied 5 different data types and the sizes of the data types:

Integer: 4 bytes
Long: 8 bytes
Float: 4 bytes
Double: 8 bytes
Character: 1 byte


You’re given a data type. Print its size in bytes.

Example :
  
Input: Long
Output: 8
Explanation: The size of a Long variable is given as 8 bytes.
*/

public class Solution {
    public static int dataTypes(String type) {

        String str = type;

        if(str.equalsIgnoreCase("Integer") || str.equalsIgnoreCase("Float")){
            return 4;
        }
        else if(str.equalsIgnoreCase("Long") || str.equalsIgnoreCase("Double")){
            return 8;
        }
        else if(str.equalsIgnoreCase("Character")){
            return 1;
        }
        return -1;
    }
}
