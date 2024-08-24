//valid parenthesis
package Strings;

import java.util.Stack;

public class pb_03 {
    public static boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        
        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '[' || ch == '{') {
                st.push(ch);
            } else {
                if (st.isEmpty()) {
                    return false; // Extra closing bracket
                }
                
                char top = st.peek();
                if ((ch == ')' && top == '(') || 
                    (ch == ']' && top == '[') || 
                    (ch == '}' && top == '{')) {
                    st.pop();
                } else {
                    return false; // Mismatched closing bracket
                }
            }
        }
        
        return st.isEmpty();
    }

    public static void main(String[] args) {
        String s = "()[]{}";
        System.out.println(isValid(s));

    }
}
