package INFOSYS;

import java.util.Scanner;
public class pb_04 {


    static final int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] a = new int[n][2];
        for (int i = 0; i < n; i++) {
            a[i][0] = sc.nextInt();
            a[i][1] = sc.nextInt();
        }

        int[] dp = new int[n];
        dp[0] = Math.max(a[0][0], a[0][1]);

        for (int i = 1; i < n; i++) {
            if(a[i][0]>dp[i-1] && a[i][1]>dp[i-1]){

                dp[i] = Math.max(dp[i - 1] + a[i][0], dp[i - 1] + a[i][1]);
            }
            else{
                dp[i]=dp[i-1];
            }
            dp[i] %= MOD;
        }

        System.out.println(dp[n - 1]);
    }
}

