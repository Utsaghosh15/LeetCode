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

    public boolean isSymmetricTree(TreeNode nodeOne,TreeNode nodeTwo){
     
     if(nodeOne == null && nodeTwo == null)
      return true;

     if(nodeOne == null || nodeTwo == null)
      return false;

     return nodeOne.val == nodeTwo.val && isSymmetricTree(nodeOne.left,nodeTwo.right) && isSymmetricTree(nodeOne.right,nodeTwo.left);
    }

    public boolean isSymmetric(TreeNode root) {
        
     if(root == null)
      return true;

     return isSymmetricTree(root.left,root.right);    
    }
}