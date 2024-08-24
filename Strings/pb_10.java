//Longest Palindromic Substring

package Strings;

public class pb_10 {
    public static String longestPalindrome(String s) {
        String lps = "";
        for(int i=0;i<s.length();i++)
        {
            int left=i;
            int right=i;
            while(left >= 0 && right < s.length() && s.charAt(left)==s.charAt(right))
            {
                left--;
                right++;
            }

            String palindrome=s.substring(left+1,right);
            if(palindrome.length()>lps.length())
            {
                lps=palindrome;
            }

            left=i;
            right=i+1;
            while(left >= 0 && right < s.length() && s.charAt(left)==s.charAt(right))
            {
                left--;
                right++;
            }

            palindrome=s.substring(left+1,right);
            if(palindrome.length()>lps.length())
            {
                lps=palindrome;
            }

        }
        return lps;
    }

    public static void main(String[] args) {
        String s = "babad";
        System.out.println(longestPalindrome(s));
    }
}
