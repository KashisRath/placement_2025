//best time to buy and sell stock
package Array;

public class pb_06 {
    public static int maxProfit(int[] prices) {
        int maxprofit=0;
        int min=Integer.MAX_VALUE;

        int minI;
        for(int i=0;i<prices.length;i++)
        {
           if(prices[i]<min)
           {
              min=prices[i];
              
           }
            else if((prices[i] - min) > maxprofit)
            {
                maxprofit=prices[i] -min;
            }
        }
        return maxprofit;    
    }

    public static void main(String[] args) {
        int prices[] = {7,1,5,3,6,4};
        int res=maxProfit(prices);
        System.out.println(res);
    }

}
