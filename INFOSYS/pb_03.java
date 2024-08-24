package INFOSYS;
import java.util.*;

public class pb_03 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr1[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr1[i]=sc.nextInt();
        }

        HashSet<Integer> h=new HashSet<>();
        for(int num:arr1)
        {
            h.add(num);
        }

        int arr2[]=new int[h.size()];

        int i=0;
        for(int num:h)
        {
            arr2[i]=num;
            i++;
        }

        Arrays.sort(arr2);
        System.out.println(lcs(arr1, arr2));
    }
    private static int lcs(int[] arr1, int[] arr2) {
        int n=arr1.length;
        int m=arr2.length;

        int dp[][]=new int[n+1][m+1];
        for(int i=0;i<n+1;i++)
        {
            dp[i][0]=0;
        }
        for(int i=0;i<m+1;i++)
        {
            dp[0][i]=0;
        }

        for(int i=1;i<n+1;i++)
        {
            for(int j=1;j<m+1;j++)
            {
                if(arr1[i-1]==arr2[j-1])
                {
                    dp[i][j]=dp[i-1][j-1]+1;
                }
                else{
                    int ans1=dp[i-1][j];
                    int ans2=dp[i][j-1];
                    dp[i][j]=Math.max(ans1, ans2);
                }
            }
        }
        return dp[n][m];
       
    }
}
