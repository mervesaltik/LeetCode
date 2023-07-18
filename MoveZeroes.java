
/* Example 1 : Your input : x = [0,1,0,3,12]
 * Output : [1,3,12,0,0]
 * Example 2 : Your input : x = [0]
 * Output : [0]
 * 
 * Given an integer array x , move all 0's to the end of it while maintaining 
 * the relative order of the non-zero elements.
 * 
 * Note that you must do this in-place without making a copy of the array.
 * 
 */

class MoveZeroes {
	
    public void moveZeroes(int[] nums) {

        int i = 0;
        for(int num:nums){
            if(num!= 0){
                nums[i] = num;
                i++;
            }
        }
     

        while(i < nums.length){
            nums[i] = 0;
            i++;
        }
        
    }

}
