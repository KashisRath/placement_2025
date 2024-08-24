//Convert a sentence into its equivalent mobile numeric keypad sequence
package Strings;

public class pb_06 {
    public static void main(String[] args) {
        String str[]
            = { "2",    "22",  "222", "3",   "33", "333",
                "4",    "44",  "444", "5",   "55", "555",
                "6",    "66",  "666", "7",   "77", "777",
                "7777", "8",   "88",  "888", "9",  "99",
                "999",  "9999" };
 
        String input = "GEEKSFORGEEKS";
        System.out.println(printSequence(str, input));
    }

    public static String printSequence(String[] str, String input) {
        String total="";
        int n=input.length();
        for(int i=0;i<n;i++)
        {
            if(input.charAt(i)==' ')
            {
                total=total+"0";
            }
            else{
                int position=input.charAt(i)-'A';
                total=total + str[position];
            }
        }
        return total;
    }
}
