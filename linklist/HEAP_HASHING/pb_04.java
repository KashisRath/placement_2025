package HEAP_HASHING;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class pb_04 {
    
    public static int[] topKFrequent(int[] nums, int k) {
       HashMap<Integer,Integer> A=new HashMap<>();
       for(int num:nums)
       {
        A.put(num,A.getOrDefault(num,0)+1);
       }

       ArrayList<Map.Entry<Integer,Integer>> B=new ArrayList<>(A.entrySet());

       B.sort((entry1,entry2)->entry2.getValue()-entry1.getValue());

       int[] rslt=new int[k];
       for(int i=0;i<k;i++)
       {
          rslt[i]=B.get(i).getKey();
       }
       return rslt;
    }

    public static void main(String[] args) {
       int[] nums = {1,1,1,2,2,3};
       int  k = 2;

       int[] result=topKFrequent(nums, k);
       for(int value:result){
        System.out.print(value+" ");
       }
    }
}
