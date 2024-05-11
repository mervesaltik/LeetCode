package deneme;

/* Your input = [1,1,2]   Output = 2, [1,2,_] 
 * Explanation : Your function should return k = 2, with the first two elements of numbers being 1 and 2 respectively.
 * it does not matter what you leave beyond the returned k (hence they are underscores). */

/*  Your input = [0,0,1,1,1,2,2,3,3,4]  Output = 5, [0,1,2,3,4,_,_,_,_,_]
 *  Explanation : Your function should return k = 5, with the first five elements of numbers being 0, 1, 2, 3, and 4 respectively.
 *  it does not matter what you leave beyond the returned k (hence they are underscores).   */

public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        for(int j=1; j<nums.length ;j++){
            if(nums[i] != nums[j]){
                i++;
                nums[i] = nums[j];
            }

        }

        return i+1;
        
    }
}
	


