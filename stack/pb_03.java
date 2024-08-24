//153 evaluation of post fix expression
package stack;

import java.util.Stack;

public class pb_03 {
    public static void main(String[] args) {
        String exp = "231*+9-";
       
        // Function call
        System.out.println("postfix evaluation: " + evaluatePostfix(exp));
    }

    public static int evaluatePostfix(String exp) {
        Stack<Integer> s = new Stack<>();
        
        for (int i = 0; i < exp.length(); i++) {
            char c = exp.charAt(i);
            
            // Check if character is a digit
            if (Character.isDigit(c)) {
                s.push(c - '0'); // Convert character to integer
            } else if (c == '+' || c == '-' || c == '*' || c == '/') {
                int val2 = s.pop();
                int val1 = s.pop();
                int result = 0;
                
                switch (c) {
                    case '+':
                        result = val1 + val2;
                        break;
                    case '-':
                        result = val1 - val2;
                        break;
                    case '*':
                        result = val1 * val2;
                        break;
                    case '/':
                        result = val1 / val2;
                        break;
                }
                s.push(result);
            }
        }
        return s.pop();
    }
}
