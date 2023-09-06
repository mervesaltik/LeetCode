/* Example 1 : Input : nums = [2,5,6,0,0,1,2], target = 0
 * Output : true
 * 
 * Example 2 : Input : nums = [2,5,6,0,0,1,2], target = 3
 * Output : false
 **/

class SearchInRotatedSortedArrayII {
    public boolean search(int[] nums, int target) {
        int left = 0;
        int right = nums.length -1;
        while(left <= right){
            int mid = left + (right - left) / 2;
            if(nums[mid] == target){
                return true;
            }
            if(nums[mid] == nums[left]){
                left++;
                continue;
            }
            if(nums[left] <= nums[mid]){
                if(nums[left] <= target && nums[mid] > target){
                    right = mid -1;
                }else{
                    left = mid + 1;
                }
            } else{
                if(nums[mid] < target && nums[right] >= target){
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }
        return false;
    }
}
