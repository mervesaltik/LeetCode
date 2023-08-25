/* Given an array nums of n integers where nums[i] is in the range [1, n],
 * return an array of all the integers in the range [1, n] that do not appear in nums.
 * 
 * Example 1 : Input : nums = [4,3,2,7,8,2,3,1]
 * Output : [5,6]
 * 
 * Example 2 : Input : nums = [1,1]
 * Output : [2]
*/

public class FindAllNumbersDisappearedInAnArray {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            int index = Math.abs(nums[i])-1;
            if(nums[index] < 0) continue;
            nums[index] *= -1;
        }

        for(int i = 0; i < nums.length; i++){
            if(nums[i] > 0) result.add(i + 1);
        }
        return result;
    }

}
