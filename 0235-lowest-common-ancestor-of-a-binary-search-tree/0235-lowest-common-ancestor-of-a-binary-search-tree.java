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

    public TreeNode LCATree(TreeNode node, TreeNode p, TreeNode q){

      if(node == null)
       return null;

      if(node.val > p.val && node.val > q.val)
        return LCATree(node.left,p,q);

      if(node.val < p.val && node.val < q.val)
        return LCATree(node.right,p,q);

      return node;    
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

      return LCATree(root,p,q);
    }
}