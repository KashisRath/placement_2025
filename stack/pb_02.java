//152 implement two stacks in an array
package stack;

public class pb_02 {
    static int[] arr;
    static int top1;
    static int top2;
    static int size;

    pb_02(int n)
    {
        size=n;
        arr=new int[n];
        top1=n/2+1;
        top2=n/2;
    }

    void push1(int x) 
    { 
  
        // There is at least one empty 
        // space for new element 
        if (top1 > 0) { 
            top1--; 
            arr[top1] = x; 
        } 
        else { 
            System.out.println("Stack Overflow"
                             + " By element : " + x); 
            return; 
        } 
    } 

    void push2(int x) 
    { 
  
        // There is at least one empty 
        // space for new element 
        if (top2 < size - 1) { 
            top2++; 
            arr[top2] = x; 
        } 
        else { 
            System.out.println("Stack Overflow"
                             + " By element : " + x); 
            return; 
        } 
    } 

    public static int pop1()
    {
        if(top1<=size/2)
        {
            int x=arr[top1];
            top1++;
            return x;
        }
        else{
            System.out.println("stack1 is empty");
        }
        return 0;
    }

    public static int pop2()
    {
        if(top2>=size/2 + 1)
        {
            int x=arr[top1];
            top1--;
            return x;
        }
        else{
            System.out.println("stack2 is empty");
        }
        return 0;
    }

    public static void main(String[] args) {
        pb_02 stack=new pb_02(5);
        stack.push1(5);
        stack.push2(10);
        stack.push2(15);
        stack.push1(11);
        stack.push2(7);

        for(int i=top1;i<=top2;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        System.out.println("the top of stack1 is "+arr[top1]);
        System.out.println("the top of stack2 is "+arr[top2]);

        System.out.println("pop from stack1 is "+pb_02.pop1());
        System.out.println("pop from stack2 is "+pb_02.pop2());
        
    }
}
