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
    int currentNode = 1;

    public void InOrderTraversal(TreeNode node,int k){

     if(node == null)
       return;


     InOrderTraversal(node.left,k);



     System.out.print(node.val);
     
     if(k == currentNode)
      result = node.val;

     currentNode++; 
     
     InOrderTraversal(node.right,k);

    }
     
    public int kthSmallest(TreeNode root, int k) {

     InOrderTraversal(root,k);

     return result;    
    }
}