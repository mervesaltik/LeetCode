
/* You are given an integer array height of length n. 
 * There are n vertical lines drawn such that the two end points of the ith line are (i, 0) and (i, height[i]).
 * Find two lines that together with the x-axis form a container, such that the container contains the most water.
 * Return the maximum amount of water a container can store.Notice that you may not slant the container.
 *  
 * Example 1 : Your input : height : [1,8,6,2,5,4,8,3,7]
 * Output : 49
 * Explanation : The above vertical lines are represented by array 
 * [1,8,6,2,5,4,8,3,7]. in this case, the max area of water (blue section) the container can contain is 49. 
 * 
 * Example 2 : Your input : height : [1,1]
 * Output : 1 */

class ContainerWithMostWater {
    public int maxArea(int[] height) {

        int left_side = 0;
        int right_side = height.length - 1;
        int max_area = 0;

        while(left_side < right_side){
            int w = right_side - left_side;
            int h = Math.min(height[left_side],height[right_side]);
            int area = w * h ; 

            max_area = Math.max(max_area, area);
            if(height[left_side] < height[right_side]){
                left_side++;
            } else if(height[left_side] > height[right_side]){
                right_side--;
            } else{
                left_side++;
                right_side--;
            }

        }
        return max_area;
    }

}
