//Lexicographically smallest array after at-most K consecutive swaps
package Greedy_Alogorithims;

public class pb_14 {
    public static void main(String[] args) {
        int arr[]={7, 6, 9, 2, 1};
        int k=3;
        lexigraphSmall(arr,k);
    }

    public static void lexigraphSmall(int[] arr, int k) {
          for(int i=0;i<arr.length-1 && k>0;i++)
          {
            int pos=i;
            for(int j=i+1;j<arr.length;j++)
            {
                if(j-i>k)
                {
                    break;
                }
                if(arr[j]<arr[i])
                {
                    pos=j;
                }
            }
            
            int temp;
            for(int j=pos;j>i;j--)
            {
                temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
            }
            k -= (pos - i);
        }

          for(int i=0;i<arr.length;i++)
          {
            System.out.print(arr[i]+"  ");
          }
    }
}
