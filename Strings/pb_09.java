//Amazing Subarrays
package Strings;

public class pb_09 {
    public static int solve(String A) {
        int count = 0;
        int n = A.length();
        int mod = 10003;

        // Iterate over each character in the string
        for (int idx = 0; idx < n; idx++) {
            char c = A.charAt(idx);
            // Check if the character is a vowel (either uppercase or lowercase)
            if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' ||
                c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count = (count + (n - idx)) % mod;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        String str="ABEC";
        System.out.println(solve(str));
    }
}

