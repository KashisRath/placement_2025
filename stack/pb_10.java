//162 find if the expression have duplicate parenthesis
package stack;

import java.util.Stack;

public class pb_10 {
    public static void main(String[] args) {
        String str="((a+b))";
		if(isduplicate(str))
		{
			System.out.println("is duplicate");
		}
		else{
			System.out.println("not duplicate");
		}
    }

	public static boolean isduplicate(String str) {
		Stack<Character> stack=new Stack<>();
        char[] ch=str.toCharArray();
		for(char c:ch)
		{
             if(c == ')')
			 {
                  int top=stack.peek();
				  stack.pop();

				  int elementsInside=0;
				  if(top=='(')
				  {
                      elementsInside++;
					  top=stack.peek();
					  stack.pop();
				  }
				  if(elementsInside<1)
				  {
					return true;
				  }
			 }
			 else{
				stack.push(c);
			 }
		}
		return false;
	}
}

