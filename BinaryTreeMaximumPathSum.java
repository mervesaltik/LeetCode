/* Example 1 : Input : root = [1,2,3]
 * Output : 6
 * Explanation : The optimal path is 2 -> 1 -> 3 with a path sum of 2 + 1 + 3 = 6.
 * 
 * Example 2 : Input : root = [-10,9,20,null,null,15,7]
 * Output : 42
 * Explanation : The optimal path is 15 -> 20 -> 7 with a path sum of 15 + 20 + 7 = 42.
 **/
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class BinaryTreeMaximumPathSum {
    int max = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        pathSum(root);
        return max;
    }
    int pathSum(TreeNode root) {
        if (root == null) {
            return 0;
        }     
        int left = Math.max(0, pathSum(root.left));
        int right = Math.max(0, pathSum(root.right));
        
        max = Math.max(max, root.val + left + right);
      
        return root.val + Math.max(left, right);
    }
}
