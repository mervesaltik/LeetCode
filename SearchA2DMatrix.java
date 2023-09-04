/* Example 1 : Input : matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
 * Output : true
 * 
 * Example 2 : Input : matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 13
 * Output : false */

class SearchA2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int column = matrix[0].length;
        int left = 0, right = row * column - 1;

        while(left <= right){
            int mid = left + (right - left) / 2 ;
            int mid_val = matrix[mid / column][mid % column];

            if(mid_val == target){
                return true;
            }else if(mid_val < target){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
            return false;
        }
}
