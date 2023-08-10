/* Given the root of a binary tree, return the preorder traversal of its nodes' values.
 * 
 * Example 1 : Input : root = [1,null,2,3]
 * Output : [1,2,3]
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

class BinaryTreePreorderTraversal {
	
    public ArrayList<Integer> preorderTraversal(TreeNode root) {
    	
        Stack <TreeNode> stack = new Stack<TreeNode>();
        ArrayList <Integer> arraylist = new ArrayList<Integer>();
        
        while(!stack.isEmpty() || root!=null){
            while(root!=null){
            arraylist.add(root.val);
            stack.push(root);
            root = root.left;
            
        }
        root = stack.pop();        
        root = root.right;
    }
        
    return arraylist;
}
}
	
	


