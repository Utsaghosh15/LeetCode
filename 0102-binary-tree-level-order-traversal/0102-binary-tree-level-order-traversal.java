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
    public List<List<Integer>> levelOrder(TreeNode root) {

     List<List<Integer>> result = new ArrayList<>();

     if(root == null)
      return result;   

     Queue<TreeNode> queue = new LinkedList<>();
     queue.add(root); 
     int level_count = queue.size(); 


     while(!queue.isEmpty()){
      
      List<Integer> temp_result = new ArrayList<>();

      while(level_count != 0){

       TreeNode temp = queue.poll();

       temp_result.add(temp.val);

       if(temp.left != null)
         queue.add(temp.left);

       if(temp.right != null)
         queue.add(temp.right);  


       level_count--;
      }

      result.add(temp_result);
      level_count = queue.size();
     }

     return result;
    }
}