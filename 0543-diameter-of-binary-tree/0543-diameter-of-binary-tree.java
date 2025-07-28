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

   public int DiameterOfTree(TreeNode node){

    if(node == null)
     return 0;

    int left = DiameterOfTree(node.left);
    int right = DiameterOfTree(node.right);

    result = Math.max((left+right),result); 

    return Math.max(left,right)+1;  
   } 


    public int diameterOfBinaryTree(TreeNode root) {

     DiameterOfTree(root);   

     return result;   
    }
}