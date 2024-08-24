//166 Queue based approach for first non-repeating character in a stream
package stack;

import java.util.LinkedList;
import java.util.Queue;

public class pb_13 {
    public static void main(String[] args) {
        String str="aabccxb";
        npc(str);
    }

    public static void npc(String str) {
        int max_char=26;

        int[] charidx=new int[max_char];
        Queue<Character> q=new LinkedList<>();

        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i); 
  
            
            q.add(ch); 
  
             
            charidx[ch - 'a']++; 
            while(!q.isEmpty())
            {
                if(charidx[q.peek()]>1)
                {
                    q.remove();
                }
                else{
                    System.out.print(q.peek()+" ");
                    break;
                }
            }
            if(q.isEmpty())
            {
                System.out.println(-1+ " ");
            }
        }
    }
}
