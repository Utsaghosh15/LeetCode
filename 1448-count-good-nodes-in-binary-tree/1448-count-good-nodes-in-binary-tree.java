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

    int count = 0;

    public void goodCountNodes(TreeNode node,int largestNode){

     if(node == null)
       return;

     if(node.val >= largestNode)
      count+=1;

     goodCountNodes(node.left, Math.max(largestNode,node.val));      
     goodCountNodes(node.right, Math.max(largestNode,node.val));      
    }    


    public int goodNodes(TreeNode root) {
      
     goodCountNodes(root,root.val);

     return count; 
    }
}