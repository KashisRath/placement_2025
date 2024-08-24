//Merge Overlapping Intervals
package Array;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Stack;

public class pb_16 {
    public static class Interval{
        int start;
        int end;
        public Interval(int start,int end)
        {
            this.start=start;
            this.end=end;
        }
    }

    public static void mergeInterval(Interval interval[])
    {
        if(interval.length<=0)
        {
            return ;
        }
        Stack<Interval> stack=new Stack<>();

        
        Arrays.sort(interval, new Comparator<Interval>(){
            public int compare(Interval i1,Interval i2)
            {
                return i1.start-i2.start;
            }
        });
        stack.add(interval[0]);

        
        for(int i=1;i<interval.length;i++)
        {
            Interval top=stack.peek();

            if(top.end<interval[i].start)
            {
                stack.push(interval[i]);
            }

            else if(top.end<interval[i].end)
            {
                top.end=interval[i].end;
                stack.pop();
                stack.push(top);
            }
        }

        System.out.println("intervals: ");
        while(!stack.empty())
        {
            Interval t=stack.pop();
            System.out.println("["+t.start+","+t.end+"]");
        }
    }
    public static void main(String[] args) {
        Interval interval[]=new Interval[4];
        interval[0] =new Interval(6, 8);
        interval[1] =new Interval(1, 9);
        interval[2] =new Interval(2, 4);
        interval[3] =new Interval(4, 7);

        mergeInterval(interval);
    }
}
