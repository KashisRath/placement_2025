// Question 2 :
// You are given a number (eg - 2019), convert it into a String of english like
// “two zero one nine”. Use a recursive function to solve this problem.
// NOTE - The digits of the number will only be in the range 0-9 and the last digit of a number
// can’t be 0.
// Sample Input : 1947
// Sample Output : “one nine four seven”

package recurssion;

public class pb_04 {
    public static void ntow(int num, String[] arr) {
        if (num == 0) {
            return;
        }
        ntow(num / 10, arr);
        System.out.print(arr[num % 10] + " ");
    }

    public static void main(String[] args) {
        int num = 1947;
        String arr[] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

            ntow(num, arr);
        
    }
}
