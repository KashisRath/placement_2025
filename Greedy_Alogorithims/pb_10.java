//191 maximum length chain
package Greedy_Alogorithims;

import java.util.Arrays;
import java.util.Comparator;

public class pb_10 {
    public static void main(String[] args) {
        int arr[][] = { { 5, 24 }, { 39, 60 }, { 15, 28 }, { 27, 40 }, { 50, 90 } };
        int n = 5;

        int result = maxLenChain(arr, n);
        System.out.println(result);
    }

    public static int maxLenChain(int[][] arr, int n) {
        Arrays.sort(arr, new C());

        int prev = -100000000;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i][0] > prev) {
                prev = arr[i][1];
                ans++;
            }
        }
        return ans;

    }

    public static class C implements Comparator<int[]> {
        public int compare(int[] a1, int[] a2) {
          return Integer.compare(a1[1], a2[1]);
        }
      
    }
}
