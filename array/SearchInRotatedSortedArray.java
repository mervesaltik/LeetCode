/* Example 1 : Input : nums = [4,5,6,7,0,1,2], target = 0 
 * Output : 4
 * 
 * Example 2 : Input : nums = [4,5,6,7,0,1,2], target = 3
 * Output : -1
 * 
 * Example 3 : Input : nums = [1], target = 0 
 * Output : -1
 **/


class SearchInRotatedSortedArray {
	
    public int search(int[] nums, int target) {

        int left = 0;
        int right = nums.length-1;

        while(left <= right){
            int mid = left + (right - left) / 2;

            if(nums[mid] == target){
                return mid;
            }

            if(nums[left] <= nums[mid]){
                if(nums[left] <= target && nums[mid] >= target){
                    right = mid -1;
                }else{
                    left = mid + 1;
                }
            }else{
                if(nums[right] >= target && nums[mid] <= target){
                    left = mid + 1;
                }else{
                    right = mid - 1;
                }
            }
        }
        return -1;

        
    }

}
