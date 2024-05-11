
/* You want to maximize your profit by choosing a single day to buy one stock 
 * and choosing a different day in the future to sell that stock. 
 * 
 * Example 1 : Your input : [7,1,5,3,6,4]
 * Output : 5
 * Explanation : Buy on day 2 and sell on day 5, profit = 6 - 1 = 5
 * 
 * Example 2 : Your input : [7,6,4,3,1]
 * Output : 0
 * Explanation : in this case no transactions are done and the max profit = 0 */

class BestTimeToBuyAndSellStock {
	
    public int maxProfit(int[] prices) {
        if(prices.length == 0 ){
            return 0;
        }

        int min = Integer.MAX_VALUE;
        int profit = 0; 
        for(int i = 0 ; i < prices.length ; i++){
            if(min > prices[i]){
                min = prices[i];
            } else if (profit < prices[i]-min){
                profit = prices[i]-min;
            }
            
        }
        return profit;

       
}

}
