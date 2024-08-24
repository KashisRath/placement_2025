//Find smallest number with given number of digits and sum of digits
package Greedy_Alogorithims;

public class pb_11 {
    public static void main(String[] args) {
        int s=9,m=2;
        smallestNum(s,m);
    }

    public static void smallestNum(int s, int m) {
        if(s==0)
        {
            System.out.println(m==1 ?"smallest no is 0":"not possible" );
            return;
        }

        if(s>9*m)
        {
           System.out.println("Not possible");
           return;
        }

        s-=1;

        int result[]=new int[m];
        for(int i=m-1;i>0;i--)
        {
            if(s>9)
            {
                result[i]=9;
                s-=9;
            }
            else{
                result[i]=s;
                s=0;
            }
        }

        result[0]=s+1;

        for(int i=0;i<m;i++)
        {
            System.out.print(result[i]);
        }
    }
}
