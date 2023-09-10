/* Example 1 : Input : n = 3
 * Output : 5
 * 
 * Example 2 : Input : n = 1
 * Output : 1
 */

class UniqueBinarySearchTrees {
    public int numTrees(int n) {
        int[] dp = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;
        for(int i = 2; i <= n; i++){
            for(int j = 1; j <= i; j++){
                dp[i] += dp[j-1] * dp[i-j];
            }                     
        }
        return dp[n];
    }
}
