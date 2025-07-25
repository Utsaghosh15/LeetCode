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

    public int maxDepthTree(TreeNode node){

     if(node == null)
      return 0;

     return Math.max(maxDepthTree(node.left),maxDepthTree(node.right))+1;    
    }

    public int maxDepth(TreeNode root) {

     return maxDepthTree(root);   
    }
}