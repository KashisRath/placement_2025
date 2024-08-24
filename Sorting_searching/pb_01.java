//permute two arrays such that sum of every pair is greater or equal to K
package Sorting_searching;

import java.util.Arrays;
import java.util.Collections;

public class pb_01 {
    public static boolean permute(Integer a[], int b[], int k) {
        Arrays.sort(a, Collections.reverseOrder());
        Arrays.sort(b);

        for (int i = 0; i < a.length; i++) {
            if (a[i] + b[i] < k) {
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        Integer a[] = { 2, 1, 3 };
        int b[] = { 7, 8, 9 };
        int k = 10;
        System.out.println(permute(a, b, k));

    }
}
