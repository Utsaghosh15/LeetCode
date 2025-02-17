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

    public boolean hasPathSumTree(TreeNode node,int targetSum,int currentSum){
     
      if(node == null)
        return false; 

      if(node.left == null && node.right == null && targetSum == (currentSum+node.val))
         return true;


      return hasPathSumTree(node.left,targetSum,currentSum+node.val) || hasPathSumTree(node.right,targetSum,currentSum+node.val); 
    }

    public boolean hasPathSum(TreeNode root, int targetSum) {
     
     if(root == null)
      return false;

     return hasPathSumTree(root,targetSum,0);           
    }
}