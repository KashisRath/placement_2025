package INFOSYS;

import java.util.*;
public class pb_09 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        int[] B = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        for (int i = 0; i < N; i++) {
            B[i] = sc.nextInt();
        }
        int[] dp = new int[N];
        dp[0] = A[0];
        for (int i = 1; i < N; i++) {
            dp[i] = Integer.MAX_VALUE;
            for (int j = 0; j < i; j++) {
                dp[i] = Math.min(dp[i], dp[j] + (i - j - 1) * B[j] + A[i]);
            }
        }
        System.out.println(dp[N - 1]);
    }
}