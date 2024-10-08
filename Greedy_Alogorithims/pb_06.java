//187 Find maximum equal sum of every three stacks
package Greedy_Alogorithims;

public class pb_06 {
    public static void main(String[] args) {
        int stack1[] = { 3, 2, 1, 1, 1 };
        int stack2[] = { 4, 3, 2 };
        int stack3[] = { 1, 1, 4, 1 };

        int n1 = stack1.length;
        int n2 = stack2.length;
        int n3 = stack3.length;
        int result=maxEqualSum(stack1, stack2, stack3, n1, n2, n3);
        System.out.println(result);
    }

    public static int maxEqualSum(int[] stack1, int[] stack2, int[] stack3, int n1, int n2, int n3) {
        int sum1 = 0, sum2 = 0, sum3 = 0;

        for (int i = 0; i < n1; i++) {
            sum1 += stack1[i];
        }
        for (int i = 0; i < n2; i++) {
            sum2 += stack2[i];
        }
        for (int i = 0; i < n3; i++) {
            sum3 += stack3[i];
        }
        int top1 = 0, top2 = 0, top3 = 0;

        while (true) {
              // If any stack is empty, the max possible equal sum is 0
            if (top1 == n1 || top2 == n2 || top3 == n3) {
                return 0;
            }

            // If sums of all three stacks are equal
            if (sum1 == sum2 && sum2 == sum3) {
                return sum1;
            }

            // Remove the top element of the stack with the maximum sum
            if (sum1 >= sum2 && sum1 >= sum3) {
                sum1 -= stack1[top1++];
            } else if (sum2 >= sum1 && sum2 >= sum3) {
                sum2 -= stack2[top2++];
            } else if (sum3 >= sum2 && sum3 >= sum1) {
                sum3 -= stack3[top3++];
            }
        }
    }
}
