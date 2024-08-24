//validate string
package Strings;

public class pb_01 {
    public static boolean isPalindrome(String s) {
        String s2=s.toLowerCase();
        int n=s2.length()-1;
        int i=0;
        while(i<=n)
        {
            while(i<n && !Character.isLetterOrDigit(s2.charAt(i))){
                i++;
            }
            while(i<n && !Character.isLetterOrDigit(s2.charAt(n))){
                n--;
            }

            if(s2.charAt(i)!=s2.charAt(n))
            {
                return false;
            }
            i++;
            n--;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }
}
