/* F(0) = 0, F(1) = 1
 * F(n) = F(n - 1) + F(n - 2), for n > 1. 
 * 
 * Example 1 : Input : n = 2
 * Output : 1
 * Explanation : F(2) = F(1) + F(0) = 1 + 0 = 1.
 * 
 * Example 2 : Input : n = 3
 * Output : 2
 * Explanation : F(3) = F(2) + F(1) = 1 + 1 = 2.
 * 
 * Example 3 : 
 * Input : n = 4
 * Output : 3
 * Explanation : F(4) = F(3) + F(2) = 2 + 1 = 3.
*/

class FibonacciNumber {	
    public int fib(int n) {
        if(n == 0) return 0;
        int a = 1; 
        int b = 0;
        int c = 1;

        for(int i = 2 ; i <= n; i++){
            c = a + b;
            b = a; 
            a = c;
        }

        return a ;
    }

}

/*
class FibonacciNumber{
    public int fib(int n) {
        int[] dp = new int[n+2];
        dp[0] = 0;
        dp[1] = 1;

        for(int i = 2; i <= n; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }

        return dp[n];
        
    }
}
*/


