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
    int current = 0;

    public void InOrderTraversal(TreeNode node,int k){
     
     if(node == null)
      return;
  
     InOrderTraversal(node.left,k);
     current+=1;
     
     if(k == current){
      result = node.val; 
      return;
     }

     InOrderTraversal(node.right,k);
    }

    public int kthSmallest(TreeNode root, int k) {

     InOrderTraversal(root,k);

     return result;  
    }
}