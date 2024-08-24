//K’th Smallest Element in Unsorted Array
package HEAP_HASHING;

import java.util.Arrays;

public class pb_06 {
    public static void main(String[] args) {
        int[] arr = { 12, 3, 5, 7, 19 };
        int n = arr.length;
        int k = 2;
        System.out.println("The " + k
                + "th smallest element is "
                + kthSmallest(arr, n, k));

    }

    public static int kthSmallest(int[] arr, int n, int k) {
        int largest = arr[0];
        for (int i = 1; i < n; i++) {
            if (largest < arr[i]) {
                largest = arr[i];
            }
        }

        int freq[] = new int[largest + 1];
        Arrays.fill(freq, 0);
        for (int i = 0; i < n; i++) {
            freq[arr[i]]++;
        }

        int count = 0;
        for (int i = 0; i <= largest; i++) {
            if (freq[i] != 0) {
                count+=freq[i];
                if (count >= k) {
                    return i;
                }
            }
        }
        return -1;
    }
}