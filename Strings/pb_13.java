//Wildcard string matching
package Strings;

public class pb_13 {
    public static boolean match(String wild, String pattern) {
        return solve(wild, pattern, wild.length() - 1, pattern.length() - 1);
    }

    public static boolean solve(String wild, String pattern, int i, int j) {
        // Base case: if both indices are negative, strings have been successfully matched
        if (i < 0 && j < 0) {
            return true;
        }

        // Base case: if pattern is exhausted but wildcard is not
        if (i < 0 && j >= 0) {
            return false;
        }

        // Base case: if wildcard is exhausted but pattern is not
        if (i >= 0 && j < 0) {
            for (int k = 0; k <= i; k++) {
                if (wild.charAt(k) != '*') {
                    return false;
                }
            }
            return true;
        }

        // If characters match or wildcard has '?', move to the next characters
        if (wild.charAt(i) == pattern.charAt(j) || wild.charAt(i) == '?') {
            return solve(wild, pattern, i - 1, j - 1);
        }

        // If wildcard has '*', it can match zero or more characters
        if (wild.charAt(i) == '*') {
            return solve(wild, pattern, i - 1, j) || solve(wild, pattern, i, j - 1);
        }

        // If characters don't match
        return false;
    }

    public static void main(String[] args) {
        String wild = "ge*ks";
        String pattern = "geeks";

        System.out.println(match(wild, pattern));
    }

}
