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

    public void goodNodesTree(TreeNode node,int max){

     if(node == null)
      return;

     if(node.val >= max)
      count+=1;

     goodNodesTree(node.left,node.val > max ? node.val : max);     
     goodNodesTree(node.right,node.val > max ? node.val : max);     
    }

    public int goodNodes(TreeNode root) {

     goodNodesTree(root,root.val);  
     return count; 
    }
}