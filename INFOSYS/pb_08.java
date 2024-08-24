// Sample 2: Medium 
// Sample output-2: 
// You are given a tree consisting of N nodes. 
// You are also given two arrays A and P of size N each, where the 
// value A[i] denotes the value written on the ith node and the 
// value P[i] denotes that there is an edge between the 
// node i and P[i]. 
// We say that an edge is considered good, if after deleting this 
// edge (this will result in formation of 2 trees), the values in each of 
// the nodes of the trees are distinct. 
// Find the total number of good edges present in tree. 
// Input Format 
// 1. 
// 2. 
// 3. 
// The first line contains an integer, N, denoting the number of 
// elements in A. 
// Each line i of the N subsequent lines (where 0 ≤ i < N) 
// contains an integer describing A[i]. 
// Each line i of the N subsequent lines (where 0 ≤ i < N) 
// contains an integer describing P[i]. 
// Constraints 
// • 1	<=	𝑁	<=	10^5 
// • 1	<=	𝐴[𝑖]	<=	10^5 
// • 1	<=	𝑃[𝑖]	<=	10^5 
// Sample Input-1: 
// 2	1	1	0	1	
// Sample output-1: 
// 1	
// Explanation-1: 
// Given N = 2, A = [1, 1], P = [0, 1] The only 
// edge between the node 1 - 2 is good. Hence, 
// the answer is equal to 1. 
// Sample Input-2: 
// 4	1	2	3	4	0	1	2	3		
// 3 
// Explanation-2: 
// Given N = 4, A = [1, 2, 3, 4], P = [0, 1, 2, 3] All of edges 1 - 2, 3 - 2, 3 - 4 are 
// good edges. Hence, the answer is equal to 3. 
// Sample Input-3: 
// 6 1 1 2 3 2 3 0 1 2 3 4 5  
// Sample output-3: 
// 0 
// Explanation-3: 
// Given N = 6, A = [1, 1, 2, 3, 2, 3], P = [0, 1, 2, 
// 3, 4, 5] None of the edges are good. Hence, the 
// answer is equal to 0.
package INFOSYS;
import java.util.*;


public class pb_08 {
    static int[] A, P, cnt;
    static ArrayList<Integer>[] adj;
    static int ans;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        A = new int[N];
        P = new int[N];
        cnt = new int[100001];
        adj = new ArrayList[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
            adj[i] = new ArrayList<>();
        }
        for (int i = 0; i < N; i++) {
            P[i] = sc.nextInt();
            adj[P[i]].add(i);
        }
        ans = 0;
        dfs(0, -1);
        System.out.println(ans);
    }

    static int dfs(int u, int p) {
        int before = cnt[A[u]];
        cnt[A[u]]++;
        for (int v : adj[u]) {
            if (v != p) {
                dfs(v, u);
            }
        }
        if (p != -1 && cnt[A[u]] - before == 1) {
            ans++;
        }
        cnt[A[u]]--;
        return 0;
    }
}