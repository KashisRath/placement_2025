//186
// Java program to acquire 
// all n coins 
package Greedy_Alogorithims;
import java.util.Arrays; 

class GFG 
{ 
	
	// function to calculate min cost 
	static int minCost(int coin[], 
					int n, int k) 
	{ 
		
		// sort the coins value 
		Arrays.sort(coin); 

		// calculate no. of 
		// coins needed 
		int coins_needed = (int)Math.ceil(1.0 * 
								n / (k + 1)); 

		// calculate sum of 
		// all selected coins 
		int ans = 0; 
		
		for (int i = 0; i <= coins_needed - 1; 
										i++) 
			ans += coin[i]; 

		return ans; 
	} 
	
	// Driver code 
	public static void main(String arg[]) 
	{ 
		int coin[] = { 1,2,3,4 }; 
		int n = coin.length; 
		int k = 2; 
		
		System.out.print(minCost(coin, n, k)); 
	} 
} 

// This code is contributed 
// by Anant Agarwal. 
