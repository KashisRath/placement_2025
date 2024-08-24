//183 Minimum sum of two numbers formed from digits of an array

package Greedy_Alogorithims;

import java.util.PriorityQueue;

public class pb_03 {
    public static void main(String[] args) {
        int nums[]={5, 3, 0, 7, 4};
        minSum(nums);
    }

    public static void minSum(int[] nums) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i: nums)
        {
            pq.add(i);
        }

        StringBuilder num1=new StringBuilder();
        StringBuilder num2=new StringBuilder();
        while(!pq.isEmpty())
        {
            num1.append(pq.poll());
            if(!pq.isEmpty())
            {
                num2.append(pq.poll());
            }
        }

        int sum = Integer.parseInt(num1.toString()) + Integer.parseInt(num2.toString());
        System.out.println(sum);
    }
}
