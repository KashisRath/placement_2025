//181 Activity Selection Problem | Greedy Algo-1
package Greedy_Alogorithims;

public class pb_01 {
    public static void main(String[] args) {
        int s[]={1,3,5,0,2,8,10};
        int f[]={2,4,6,8,7,9,12};
        int n=s.length;
        asp(s,f,n);
    }

    public static void asp(int[] s, int[] f, int n) {
        int i,j;
        System.out.println("The activites involved are: ");
        i=0;
        System.out.print(i+" ");
        for(j=1;j<n;j++)
        {
            if(s[j]>f[i])
            {
                System.out.print(j+" ");
                i=j;
            }
        }
        System.out.println();
    }
}
