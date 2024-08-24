//Question 6
// Problem Statement:
// You are given a grid with N rows and M columns. Each cell of the grid contains a non-negative integer. Your task is to find the maximum sum of any path from the top-left corner to the bottom-right corner of the grid. You can only move down or right at any point in time.

// Input:
// The first line contains two integers N and M (1 ≤ N, M ≤ 1000), the dimensions of the grid.
// The next N lines contain M integers each, representing the grid.
// Output:
// Print a single integer representing the maximum sum of any path from the top-left to the bottom-right corner.
// Sample Input 1:
// Copy code
// 3 3
// 1 3 1
// 1 5 1
// 4 2 1
// Sample Output 1:
// Copy code
// 12
// Explanation:
// The path with the maximum sum is 1 → 3 → 5 → 2 → 1, which gives a sum of 12.

// Sample Input 2:
// Copy code
// 2 2
// 1 2
// 3 4
// Sample Output 2:
// Copy code
// 10
package INFOSYS;

import java.util.Scanner;

public class pb_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr[][] = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println(maxSumPath(n, m, arr));
    }

    private static int maxSumPath(int n, int m, int[][] arr) {
        int[][] dp = new int[n][m];

        // Initialize the DP table with the values from the input array
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                dp[i][j] = arr[i][j];
            }
        }

        // Fill the last row and last column with initial values
        for (int j = m - 2; j >= 0; j--) {
            dp[n - 1][j] += dp[n - 1][j + 1];
        }

        for (int i = n - 2; i >= 0; i--) {
            dp[i][m - 1] += dp[i + 1][m - 1];
        }

        // Fill the rest of the DP table
        for (int i = n - 2; i >= 0; i--) {
            for (int j = m - 2; j >= 0; j--) {
                dp[i][j] += Math.max(dp[i + 1][j], dp[i][j + 1]);
            }
        }

        // The result is in the top-left cell
        return dp[0][0];
    }
}
