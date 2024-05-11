/* Given the root of a binary tree, return the postorder traversal of its nodes' values. 
 * 
 * Example 1 : Input : root = [1,null,2,3]
 * Output : [3,2,1]
 * 
 * Example 2 : Input : root = []
 * Output : []
 * 
 * Example 3 : Input : root = [1]
 * Output : [1] 
 * */

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

class BinaryTreePostorderTraversal {
	
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        dfs(root, result);
        return result;
    }

    private void dfs (TreeNode root, List<Integer> result) {
        if(root == null) {
            return ; 
        }

        dfs(root.left, result);
        dfs(root.right, result);
        result.add(root.val);
    }

}
