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

    public boolean isSametree(TreeNode nodeOne,TreeNode nodeTwo){
     
     if(nodeOne == null && nodeTwo == null)
      return true;

     if(nodeOne == null || nodeTwo == null)
      return false;

     return nodeOne.val == nodeTwo.val && isSametree(nodeOne.left,nodeTwo.left) && isSametree(nodeOne.right,nodeTwo.right);  
    }

    public boolean isSameTree(TreeNode p, TreeNode q) {

     return isSametree(p,q);
    }
}