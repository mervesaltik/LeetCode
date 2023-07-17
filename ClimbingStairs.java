
/*  You are climbing a staircase and it takes 'n' steps to reach the top.
 *  Each time you can either climb 1 or 2 steps.
 *  Example 1 : Your input : n=2   Output : 2  
 *  Explanation : There are two ways to climb to the top.
 *  1 step + 1 step  OR  2 steps 
 *  Example 2 : Your input : n=3   Output : 3
 *  Explanation : There are three ways to climb to the top.
 *  1 step + 1 step + 1 step  OR  1 step + 2 step  OR 2 steps + 1 step */

public class ClimbingStairs {
    public int climbStairs(int n) {
        if(n==1){
            return n;
        } 
        int[] x = new int[n + 1]; 
        x[1] = 1;
        x[2] = 2;

        for(int i = 3 ; i <= n ; i++){
            x[i] = x[i-1] + x[i-2];
        }
        return x[n];
        
    }

}
