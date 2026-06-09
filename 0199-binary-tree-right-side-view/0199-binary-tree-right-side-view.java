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

    public List<Integer> rightSideViewTree(TreeNode node){

     List<Integer> result = new LinkedList<>();   

     if(node == null)
      return result;   

     Queue<TreeNode> queue = new LinkedList<>();
     queue.add(node);
     int level_count = queue.size();

     while(!queue.isEmpty()){

      while(level_count > 0){

       TreeNode temp_node = queue.poll(); 

       if(level_count == 1)
         result.add(temp_node.val);

       if(temp_node.left != null)
         queue.add(temp_node.left);

       if(temp_node.right != null)  
         queue.add(temp_node.right);


       level_count-=1; 
      }

      level_count = queue.size();
     }

     return result; 
    }
    
    
    public List<Integer> rightSideView(TreeNode root) {

     return rightSideViewTree(root);
    }
}