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

    public boolean SameTree(TreeNode node,TreeNode subNode){

     if(node == null && subNode == null)
       return true;

     if(node == null || subNode == null)
       return false;
  
     return (node.val == subNode.val ? true : false) && SameTree(node.left,subNode.left) && SameTree(node.right,subNode.right);
    }


    public boolean SubTree(TreeNode node,TreeNode subNode){

     if(node == null)
       return false;

     if(node.val == subNode.val && SameTree(node,subNode) == true)
       return true;

     return SubTree(node.left,subNode) || SubTree(node.right,subNode);     
    }

    public boolean isSubtree(TreeNode root, TreeNode subRoot) {


     return SubTree(root,subRoot);   
    }
}