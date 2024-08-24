package INFOSYS;

import java.util.Scanner;

public class pb_02 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        System.out.println(birthday(n,k));
    }

    private static int birthday(int n, int k) {
        int dp[][]=new int[k+1][n+1];
        for(int i=1;i<=n;i++)
        {
            dp[1][i]=1;
        }

        for(int len=2;len<=k;len++)
        {
            for(int end=1;end<=n;end++)
            {
                for(int prev=1;prev<=n;prev++)
                {
                    if(end%prev==0)
                    {
                        dp[len][end]+=dp[len-1][prev];
                    }
                }
            }
        }

        int result=0;
        for(int i=1;i<=n;i++)
        {
            result+=dp[k][i];
        }
        return result;
    }
}