//Sample-1: Easy 
// Explanation-1 
// You are given a binary string S. 
// You can perform the following operations on S any number of 
// times (possibly zero): 
// • Select 
// an 
// index i such 
// that S[i] is equal 
// 1 and S[i+1] is equal to 0 for 0 ≤ i < len(S) -1. 
// • Remove exactly one of the character from S. 
// to 
// Find the smallest string S that you can get after performing 
// operations on S. 
// Note: 
// • If there are multiple smallest strings possible then return the 
// string which is lexicographically smallest. 
// Constraints 
// • 1	<=	len(s)	<=	10^5 
// • 1	<=	𝐴[𝑖]	<=	10^5 
// Sample Input 1 
// 0000111111	
// Sample output 1 
// 0000111111	
// Here, S = "0000111111" We cannot perform any operation on S so it 
// remains unchanged 
// Sample Input 2 
// 1111111	
// Sample output 2 
// 1111111	
// Explanation 2 
// Here, S = "1111111" There exists no 0 in S so we 
// can not perform any operation on S. Hence, S is 
// equal to "1111111". 
// 37 
// Sample Input 3 
// 110	
// Sample output 3 
// 0	
// Explanation 3 
// Here, S = "110" We can perform two operations on S as :- 1. Select the 
// index 1 and 2 and remove the character at index 1. Then S becomes 
// "10". 2. Select the index 0 and 1 and remove the character at index 0. 
// Then
package INFOSYS;
public class pb_07 {

        public static String smallestString(String s) {
            StringBuilder sb = new StringBuilder();
            boolean onesEncountered = false;
            for (char c : s.toCharArray()) {
                if (c == '1') {
                    onesEncountered = true;
                } else {
                    if (onesEncountered) {
                        return "0";
                    } else {
                        sb.append(c);
                    }
                }
            }
            if (onesEncountered) {
                return s;
            }
            return sb.toString();
        }
    
        public static void main(String[] args) {
            System.out.println(smallestString("0000111111")); // "0000111111"
            System.out.println(smallestString("1111111")); // "1111111"
            System.out.println(smallestString("110")); // "0"
        }
    }