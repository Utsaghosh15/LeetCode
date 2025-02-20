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
    public List<Double> averageOfLevels(TreeNode root) {

     List<Double> result = new ArrayList<>();

     if(root == null)
      return result;

     Queue<TreeNode> queue = new LinkedList<>();
     queue.add(root);
     int level_count = queue.size();
     double level_size = queue.size();

     while(!queue.isEmpty()){

      double level_sum = 0;

      while(level_count != 0){

        TreeNode temp = queue.poll(); 
        level_sum+=temp.val; 

        if(temp.left != null)
           queue.add(temp.left);

        if(temp.right != null)
           queue.add(temp.right);

        level_count--;
      }

      result.add(level_sum/level_size); 
      level_count = queue.size();
      level_size = queue.size();
     }

     return result;
    }
}