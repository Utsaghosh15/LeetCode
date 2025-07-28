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

    public int isBalanceTree(TreeNode node){


     if(node == null)
      return 0;
     
     int left = isBalanceTree(node.left);
     int right = isBalanceTree(node.right);

     if(Math.abs(left-right) > 1){
       result = false;
       return 0; 
     }

     return Math.max(left,right)+1;
    }

    public boolean isBalanced(TreeNode root) {

     if(root == null)
      return true;

     isBalanceTree(root); 

     return result;   
    }
}