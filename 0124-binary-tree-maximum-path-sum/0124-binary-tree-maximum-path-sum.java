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

    int max_result = Integer.MIN_VALUE;

    public int maxPathSumTree(TreeNode node){

     if(node == null)
      return 0;

     int left = Math.max(0, maxPathSumTree(node.left));
     int right = Math.max(0, maxPathSumTree(node.right));

     if(left < 0 && right < 0){
      max_result = Math.max(max_result,node.val);
     }
     else if(left < 0 || right < 0){

      if(left < 0){
       left = 0;
      }

      if(right < 0){
        right = 0;
      }  
     }
     else{
      max_result = Math.max(max_result,left+right+node.val);  
     }
        // max_result = Math.max(max_result, node.val + left + right);
     return Math.max(left,right)+node.val;
    }
    
    public int maxPathSum(TreeNode root) {

     maxPathSumTree(root);
     
     return max_result;
    }
}