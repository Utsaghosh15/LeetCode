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

    int result = 0;

    public int DiameterOfBinaryTree(TreeNode node){

     if(node == null)
      return 0;

     int left = DiameterOfBinaryTree(node.left);
     int right = DiameterOfBinaryTree(node.right);

     result = Math.max(result,left+right);

     return Math.max(left,right)+1;    
    }

    public int diameterOfBinaryTree(TreeNode root) {

     DiameterOfBinaryTree(root); 

     return result;    
    }
}