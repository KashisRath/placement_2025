//union and intersection
package HEAP_HASHING;

import java.util.HashMap;
import java.util.HashSet;

public class pb_01 {
    public static void main(String[] args) {
        int arr1[]={1,2,3};
        int arr2[]={2,4,5,3,3};
        HashSet<Integer> set=new HashSet<>();

        for(int i=0;i<arr1.length;i++)
        {
            set.add(arr1[i]);
        }
        for(int i=0;i<arr2.length;i++)
        {
            set.add(arr2[i]);
        }
        for(Integer i:set){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println(set.size());

        set.clear();

        //intersection
        for(int i=0;i<arr1.length;i++)
        {
            set.add(arr1[i]);
        }
        int count=0;
        for(int i=0;i<arr2.length;i++)
        {
            if(set.contains(arr2[i]))
            {
               System.out.print(arr2[i]+" ");
               count++;
               set.remove(arr2[i]);
            }
        }
        System.out.println("intersection is : "+count);
    }
}
