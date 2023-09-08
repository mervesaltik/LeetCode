/* Example 1 : Input : nums = [2,3,-2,4]
 * Output : 6
 * Explanation : [2,3] has the largest product 6.
 * 
 * Example 2 : Input : nums = [-2,0,-1]
 * Output : 0
 * Explanation : The result cannot be 2, because [-2,-1] is not a subarray.
 * */

class MaximumProductSubarray {
	   public int maxProduct(int[] nums) {
	        int n = nums.length;
	        int left = 1, right = 1;
	        int ans = nums[0];
	        for(int i = 0; i < n; i++){
	            if(left == 0) {
	                left = 1; 
	            } else if(right == 0){
	                right = 1;
	            }
	                left *= nums[i];
	                right *= nums[n-1-i];
	                ans = Math.max(ans, Math.max(left, right));
	            }
	            return ans;      
	    }
}
