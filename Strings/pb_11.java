//Palindromic Substrings
package Strings;

public class pb_11 {
    public static int countSubstrings(String s) {
        int count=0;

        boolean[][] dp=new boolean[s.length()][s.length()];
        for(int i=0;i<s.length();i++)
        {
            dp[i][i]=true;
            count++;
        }

        for(int i=0;i<s.length()-1;i++)
        {
            dp[i][i+1]=(s.charAt(i)==s.charAt(i+1));
            count+=dp[i][i+1] ? 1:0;
        }

        for(int length=3;length<=s.length();length++)
        {
            for(int i=0,j=length-1;j<s.length();i++,j++)
           {
            dp[i][j]=dp[i+1][j-1] && (s.charAt(i)==s.charAt(j));
            count+=dp[i][j] ? 1:0;
           }
        }
        return count;
    }

    public static void main(String[] args) {
        String  s = "abc";
        System.out.println(countSubstrings(s));
    }
}
