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

    public int DiameterofBTree(TreeNode node){

     if(node == null)
      return 0;   
     
     int left = DiameterofBTree(node.left);
     int right = DiameterofBTree(node.right);

     result = Math.max((left+right),result);

     return Math.max(left,right)+1; 
    }


    public int diameterOfBinaryTree(TreeNode root) {
     
     DiameterofBTree(root);

     return result;
    }
}