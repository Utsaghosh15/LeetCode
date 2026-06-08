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
class Solution {

    boolean result = true;

    public int isBalancedBTree(TreeNode node){

     if(node == null)
      return 0;

     int left = isBalancedBTree(node.left);
     int right = isBalancedBTree(node.right);

     if(Math.abs(left-right) > 1)
      result = false;

     return Math.max(left,right)+1;     
    }


    public boolean isBalanced(TreeNode root) {

     
     isBalancedBTree(root);

     return result;
    }
}