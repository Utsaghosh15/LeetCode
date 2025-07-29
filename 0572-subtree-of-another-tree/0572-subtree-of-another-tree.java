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


    public boolean SubTreeTraverse(TreeNode node,TreeNode subNode){
     
     if(node == null && subNode == null)
       return true;

     if(node == null || subNode == null)
       return false;

     return node.val == subNode.val && SubTreeTraverse(node.left,subNode.left) && SubTreeTraverse(node.right,subNode.right);         
    } 

    public boolean isSubTree(TreeNode node,TreeNode subNode){

     if(node == null)
      return false;

     if(node.val == subNode.val && SubTreeTraverse(node,subNode))
       return true;

     return isSubTree(node.left,subNode) || isSubTree(node.right,subNode);     
    }

    public boolean isSubtree(TreeNode root, TreeNode subRoot) {

     return isSubTree(root,subRoot); 
    }
}