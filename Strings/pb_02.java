//valid anagram
package Strings;

public class pb_02 {
    public static boolean isAnagram(String s, String t) {
        int sl=s.length();
        int tl=t.length();

        if(sl!=tl)
        {
            return false;
        }

         int[] countchar=new int[26];
        for(int i=0;i<sl;i++)
        {
            countchar[s.charAt(i)-'a']++;
            countchar[t.charAt(i)-'a']--;
        }

        for(int count:countchar)
        {
            if(count!=0)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "anagram", t = "nagaram";
        System.out.println(isAnagram(s, t));

    }
}
