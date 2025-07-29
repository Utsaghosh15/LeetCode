/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {

    public TreeNode LCA(TreeNode node,TreeNode p,TreeNode q){

     if(node == null)
      return null;

     if(node.val > p.val && node.val > q.val){
      return LCA(node.left,p,q);
     }
     else if(node.val < p.val && node.val < q.val){
      return LCA(node.right,p,q);
     }

     return node;    
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

     return LCA(root,p,q);   
    }
}