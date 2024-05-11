
/* Example 1 : Your input : root = [1,null,2,3]
 * Output = [1,3,2]
 * 
 * Example 2 : Your input : root = []
 * Output = []
 * 
 * Example 3 : Your input : root [1]
 * Output = [1] */

import java.util.ArrayList;
import java.util.Stack;

/* Definition for a binary tree node. */
 
public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {   	  
      }
      TreeNode(int val) {
    	  this.val = val;
      }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
} 

class BinaryTreeInorderTraversal {
    public ArrayList<Integer> inorderTraversal(TreeNode root) {
        Stack <TreeNode> stack = new Stack<TreeNode>();
        ArrayList <Integer> arraylist = new ArrayList<Integer>();
        while(!stack.isEmpty() || root!=null){
            while(root!=null){
            stack.push(root);
            root = root.left;
            
        }
        root = stack.pop();
        arraylist.add(root.val);
        root = root.right;
    }
    return arraylist;
}}
