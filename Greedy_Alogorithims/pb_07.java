//188 job sequencing problem
package Greedy_Alogorithims;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class pb_07 {
    char id;
    int deadline,profit; 
    public pb_07(char id,int deadline,int profit )
    {
        this.deadline=deadline;
        this.id=id;
        this.profit=profit;

    }
    public static void main(String[] args) {
        ArrayList<pb_07> arr=new ArrayList();
        arr.add(new pb_07('a', 2, 100));
        arr.add(new pb_07('b', 1, 19));
        arr.add(new pb_07('c', 2, 27));
        arr.add(new pb_07('d', 1, 25));
        arr.add(new pb_07('e', 3, 15));

        System.out.println("Following is the maximum profit sequence of job");

        int k=3;
        printJob(arr,k);

    }

    public static void printJob(ArrayList<pb_07> arr, int k) {
        int n=arr.size();
        Collections.sort(arr , (a,b)-> b.profit - a.profit);
        boolean result[]=new boolean[k];
        char job[]=new char[k];

        for(int i=0;i<n;i++)
        {
            for(int j=Math.min(k-1,arr.get(i).deadline-1);j>=0;j--)
            {
                if(result[j]==false)
                {
                   job[j]=arr.get(i).id;
                   result[j]=true;
                   break;
                }   
            }

        }

        for(char jb:job)
        {
            if (jb != '\0') {
                System.out.print(jb + " ");
            }
        }
    }
    
}
