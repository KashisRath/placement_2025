//182 Greedy Algorithm to find Minimum number of Coins
package Greedy_Alogorithims;

import java.util.Vector;

public class pb_02 {

    public static void main(String[] args) {
        int n=70;
        mnc(n);
        n=350;
        mnc(n);
    }

    public static void mnc(int n) {
        int coins[]={1,2,5,10,20,50,100,200,500};
        Vector<Integer> v=new Vector<>();
        for(int i=coins.length-1;i>=0;i--)
        {
            if(coins[i]<=n)
            {
                n-=coins[i];
                v.add(coins[i]);
            }
        }

        for(int i=0;i<v.size();i++)
        {
            System.out.print(v.elementAt(i)+" ");
        }
        System.out.println();
    }
}
