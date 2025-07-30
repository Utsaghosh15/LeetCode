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

    public void levelOrder(TreeNode node, List<List<Integer>> result){
     
     if(node == null)
      return;

     Queue<TreeNode> queue = new LinkedList<>();
     queue.add(node);
     int level_count = queue.size();

     while(!queue.isEmpty()){
      
      List<Integer> list = new LinkedList<>();

      while(level_count > 0){

       TreeNode temp_node = queue.poll(); 

       if(temp_node.left != null) 
        queue.add(temp_node.left);
      
       if(temp_node.right != null)
        queue.add(temp_node.right);

       list.add(temp_node.val);
       level_count-=1;
      }

      if(level_count == 0)
       level_count = queue.size();

      result.add(list);
     }

    }

    public List<List<Integer>> levelOrder(TreeNode root) {

     List<List<Integer>> result = new ArrayList<>();  

     levelOrder(root,result);

     return result; 
    }
}