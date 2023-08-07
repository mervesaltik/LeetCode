/* Given an integer array nums of length n and an integer target, find three integers in nums such that the sum is closest to target.
 * Return the sum of the three integers. You may assume that each input would have exactly one solution.
 * 
 * Example 1 : Input : nums = [-1,2,1,-4], target = 1
 * Output: 2
 * Explanation: The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
 * 
 * Example 2 : Input : nums = [0,0,0], target = 1
 * Output: 0
 * Explanation: The sum that is closest to the target is 0. (0 + 0 + 0 = 0).
 * */

class ThreeSumClosest {
	
    public int threeSumClosest(int[] nums, int target) {
        
    Arrays.sort(nums);
    
    int result = nums[0] + nums[1] + nums[2];
    int minDiff = Integer.MAX_VALUE;

    for (int i = 0; i < nums.length - 2; i++) {
 
      int left = i + 1;
      int right = nums.length - 1;

      while (left < right) {
    	  
        int sum = nums[i] + nums[left] + nums[right];

        if (sum == target)
          return target;
        if (sum < target)
          left++;
        else
          right--;

        int diffToTarget = Math.abs(sum - target);

        if (diffToTarget < minDiff) {
   
          result = sum;
          minDiff = diffToTarget;
        }
      }
    }
    return result;
  }

}
