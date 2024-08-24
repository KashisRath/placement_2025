//
package Array;

public class pb_08 {
    public static int[] repeatedNumber(final int[] A) {
        int n = A.length;
        
        // Calculate the expected sum and sum of squares of the first n natural numbers
        long expectedSum = (long) n * (n + 1) / 2;
        long expectedSquareSum = (long) n * (n + 1) * (2 * n + 1) / 6;

        // Calculate the actual sum and sum of squares of the elements in the array
        long actualSum = 0;
        long actualSquareSum = 0;

        for (int i = 0; i < n; i++) {
            actualSum += A[i];
            actualSquareSum += (long) A[i] * A[i];
        }

        // Calculate the differences
        long sumDifference = actualSum - expectedSum;
        long squareSumDifference = actualSquareSum - expectedSquareSum;

        // Calculate the values of the repeating and missing numbers
        long repeatingMinusMissing = sumDifference;
        long repeatingPlusMissing = squareSumDifference / sumDifference;

        long repeatingNumber = (repeatingPlusMissing + repeatingMinusMissing) / 2;
        long missingNumber = repeatingNumber - repeatingMinusMissing;

        return new int[]{(int) repeatingNumber, (int) missingNumber};
    }
    public static void main(String[] args) {
        int nums[]={3, 1, 2, 5, 3};
        int[] ans=repeatedNumber(nums);
        for(int i=0;i<ans.length;i++)
        {
            System.out.println(ans[i]);
        }
    }
}
