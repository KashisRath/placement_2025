//remove consecutive character
package Strings;

public class pb_04 {
    public static String removeConsecutiveCharacter(String S){
        String ans=S.charAt(0)+"";
        for(int i=1;i<S.length();i++)
        {
            if(S.charAt(i)!=S.charAt(i-1))
            {
                ans+=S.charAt(i);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String S = "aabb";
        System.out.println(removeConsecutiveCharacter(S));
    }
}
