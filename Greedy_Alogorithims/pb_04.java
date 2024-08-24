//184 Minimum sum of absolute difference of pairs of two arrays
package Greedy_Alogorithims;

import java.util.Arrays;

public class pb_04 {
    public static void main(String[] args) {
        int n1[]={4, 1, 8, 7};
        int n2[]={2, 3, 6, 5};

        minSum(n1,n2);
    }

    public static void minSum(int[] n1, int[] n2) {
        Arrays.sort(n1);
        Arrays.sort(n2);

        int sum=0;
        for(int i=0;i<n1.length;i++)
        {
            sum =sum+ Math.abs(n1[i]-n2[i]);
        }
        System.out.println(sum);
    }
}
