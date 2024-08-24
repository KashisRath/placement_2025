// Question 7
// Problem Statement:
// You are given an array A of N integers. You need to determine if there exists a subsequence such that the sum of its elements is even.

// Input:
// The first line contains an integer N (1 ≤ N ≤ 1000), the number of elements in the array.
// The second line contains N integers, A[i] (1 ≤ A[i] ≤ 1000).
// Output:
// Print "YES" if there exists a subsequence with an even sum, otherwise print "NO".
// Sample Input 1:
// Copy code
// 5
// 1 3 5 7 9
// Sample Output 1:
// objectivec
// Copy code
// NO
// Explanation:
// All numbers are odd, and the sum of any subsequence of odd numbers is odd.

// Sample Input 2:
// Copy code
// 4
// 2 4 6 8
// Sample Output 2:
// objectivec
// Copy code
// YES
// Explanation:
// The sum of any subsequence including at least one element will be even since all numbers are even.

// Sample Input 3:
// Copy code
// 3
// 1 2 3
// Sample Output 3:
// objectivec
// Copy code
// YES
// Explanation:
// The subsequence [2] or [1, 3] has an even sum.


package INFOSYS;

import java.util.Scanner;
public class pb_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];

        boolean hasEven = false;
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
            if (A[i] % 2 == 0) {
                hasEven = true;
            }
        }

        if (hasEven) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}


