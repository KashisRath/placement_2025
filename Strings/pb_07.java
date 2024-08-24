// Longest Repeating Character Replacement
package Strings;

public class pb_07 {
    public static int characterReplacement(String s, int k) {
        int ans=0;
        int n=s.length();
        for(char c='A';c<='Z';c++)
        {
            int i=0,j=0,replaced=0;
            while(j<n)
            {
                if(s.charAt(j)==c)
                {
                    j++;
                }
                else if(replaced<k)
                {
                    j++;
                    replaced++;
                }
                else if(s.charAt(i)==c)
                {
                    i++;
                }
                else{
                    i++;
                    replaced--;
                }
                ans=Math.max(ans,j-i);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        String s = "ABAB";
        int k = 2;
        System.out.println(characterReplacement(s, k));
    }
}
