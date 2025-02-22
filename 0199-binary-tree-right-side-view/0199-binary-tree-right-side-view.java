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
    public List<Integer> rightSideView(TreeNode root) {

      List<Integer> result = new ArrayList<>();

      if(root == null)
       return result; 

      Queue<TreeNode> queue = new LinkedList<>();
      queue.add(root);
      int level_count = queue.size();

      while(!queue.isEmpty()){

        while(level_count != 0){

          TreeNode temp = queue.poll();

          if(temp.left != null)
            queue.add(temp.left);

          if(temp.right != null)
            queue.add(temp.right);

          if(level_count == 1){
            result.add(temp.val);
          } 
          
          level_count--;      
        }

        level_count = queue.size();
      }

      return result;
    }
}