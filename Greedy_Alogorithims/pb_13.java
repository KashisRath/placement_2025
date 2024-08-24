//Paper Cut into Minimum Number of Squares
package Greedy_Alogorithims;

public class pb_13 {
    public static void main(String[] args) {
        int n=13,m=29;
        minSquare(n,m);
    }

    public static void minSquare(int n, int m) {
         int result=0,rem=0;

         if(n<m)
         {
            swap(n,m);
         }

         while(m>0)
         {
            result+=n/m;
            rem=n%m;
            n=m;
            m=rem;
         }
         System.out.println(result);
    }

    public static void swap(int n, int m) {
        int temp=n;
        n=m;
        m=temp;
    }
}
