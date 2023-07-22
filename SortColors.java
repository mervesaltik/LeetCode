/* Given an array nums with n objects colored red, white, or blue, 
 * sort them in-place so that objects of the same color are adjacent, 
 * with the colors in the order red, white, and blue.

 * We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.
 * You must solve this problem without using the library's sort function.
 *
 * Example 1 : Input : nums = [2,0,2,1,1,0]
 * Output : [0,0,1,1,2,2]
 * 
 * Example 2 : Input : nums = [2,0,1]
 * Output : [0,1,2]  */


class SortColors {
    public void sortColors(int[] nums) {
        if(nums.length == 0 || nums.length == 1){
            return;
        }

        int start = 0;
        int end = nums.length - 1;
        int index = 0;

        while(start < end && index <= end){
            if(nums[index] == 0){
                nums[index] = nums[start];
                nums[start]=0;
                start++;
                index++;
            } else if (nums[index] == 2){
                nums[index] = nums[end];
                nums[end] = 2;
                end--;
            }else{
                index++;
            }
        }

    }

}
