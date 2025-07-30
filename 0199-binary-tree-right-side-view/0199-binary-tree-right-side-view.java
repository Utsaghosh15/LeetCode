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
    
    public void rightSide(TreeNode node,List<Integer> result){

     if(node == null)
      return; 

     Queue<TreeNode> queue = new LinkedList<>();
     queue.add(node);
     int level_count = queue.size();

     while(!queue.isEmpty()){

      while(level_count > 0){

        TreeNode temp = queue.poll();

        if(level_count == 1)
         result.add(temp.val);

        if(temp.left != null)
          queue.add(temp.left);

        if(temp.right != null)
          queue.add(temp.right);

        level_count-=1;    
      }

      if(level_count == 0)
        level_count = queue.size();
     }
    }
    
    public List<Integer> rightSideView(TreeNode root) {

     List<Integer> result = new ArrayList<>();

     rightSide(root,result);

     return result;
    }
}