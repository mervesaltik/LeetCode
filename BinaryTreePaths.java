/* Given the root of a binary tree, return all root-to-leaf paths in any order.
 * A leaf is a node with no children.
 * 
 * Example 1 : Input : root = [1,2,3,null,5]
 * Output : ["1->2->5","1->3"]
 * 
 * Example 2 : Input : root = [1]
 * Output : ["1"]
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

class BinaryTreePaths { 	
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list = new ArrayList<String>();
        if(root == null){
            return list;
        }

        String str = Integer.toString(root.val);

        if(root.left == null && root.right == null){
            list.add(str);
        }
        if(root.left != null){
            dfs(root.left, str, list);
        }

        if(root.right != null){
            dfs(root.right, str, list);
        }
        
        return list;
    }

    public void dfs(TreeNode node, String str, List<String> list){
        str += "->" + node.val;

        if(node.left == null && node.right == null){
            list.add(str);
            return;
        }
        if(node.left != null)  dfs(node.left, str, list);

        if(node.right != null) dfs(node.right, str, list);

        }

}
