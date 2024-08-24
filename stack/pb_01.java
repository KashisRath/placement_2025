package stack;

import java.util.Stack;

public class pb_01 {
    public static Boolean palindromeOrNot(Stack<Character> s, int length) {
        Stack<Character> p = new Stack<>();

        // Copy elements from the original stack to preserve it
        Stack<Character> temp = new Stack<>();
        while (!s.isEmpty()) {
            temp.push(s.pop());
        }
        while (!temp.isEmpty()) {
            char c = temp.pop();
            s.push(c);
            p.push(c);
        }

        int halfLength = length / 2;

        // Pop half elements from the original stack
        for (int i = 0; i < halfLength; i++) {
            s.pop();
        }

        // If the length is odd, skip the middle element
        if (length % 2 != 0) {
            s.pop();
        }

        // Compare elements from the stack and the reverse stack
        while (!s.isEmpty()) {
            if (!s.pop().equals(p.pop())) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Stack<Character> s = new Stack<>();
        s.push('a');
        s.push('b');
        s.push('c');
        s.push('b');
        s.push('a');

        int length = s.size();
        System.out.println("Length is: " + length);

        boolean result = palindromeOrNot(s, length);
        System.out.println("Is palindrome: " + result);
    }
}
