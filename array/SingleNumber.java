/* Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
 * You must implement a solution with a linear runtime complexity and use only constant extra space.
 * 
 * Example 1 : Your input : nums = [2,2,1]
 * Output : 1
 * 
 * Example 2 : Your input : nums = [4,1,2,1,2]
 * Output : 4
 * 
 * Example 3 : Your input : nums = [1]
 * Output : 1
 * 
 * Bitwise XOR (exclusive or) "^" is an operator in Java that provides the answer '1' 
 * if both of the bits in its operands are different, if both of the bits are same then the XOR operator gives the result '0'.
 * XOR is a binary operator that is evaluated from left to right. */

class SingleNumber {
    public int singleNumber(int[] nums) {
        
        int result = 0;
        for(int i : nums){
            result ^= i ;
        }
        return result;
    }

}
