package Accenture;
public class pb_03 {

    public static void main(String[] args) {
        String input = "796115110113721110141108"; // Sample input
        System.out.println(decodePassword(input));
    }

    public static String decodePassword(String input) {
        // Reverse the input string
        StringBuilder reversedString = new StringBuilder(input).reverse();
        StringBuilder password = new StringBuilder();

        int i = 0;
        int length = reversedString.length();

        while (i < length) {
            // Attempt to parse a three-digit ASCII value
            if (i + 2 < length) {
                int asciiValue = Integer.parseInt(reversedString.substring(i, i + 3));
                if (isValidAscii(asciiValue)) {
                    password.append((char) asciiValue);
                    i += 3;
                    continue;
                }
            }

            // Attempt to parse a two-digit ASCII value
            if (i + 1 < length) {
                int asciiValue = Integer.parseInt(reversedString.substring(i, i + 2));
                if (isValidAscii(asciiValue)) {
                    password.append((char) asciiValue);
                    i += 2;
                    continue;
                }
            }

            // Move to the next character if no valid ASCII was found
            i++;
        }

        // Return the final decoded password
        return password.toString();
    }

    // Check if the ASCII value is valid for the given problem constraints
    private static boolean isValidAscii(int asciiValue) {
        return (asciiValue >= 65 && asciiValue <= 90) || // A-Z
               (asciiValue >= 97 && asciiValue <= 122) || // a-z
               (asciiValue == 32); // Space
    }
}
