/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {

     Queue<Node> queue = new LinkedList<>();
     queue.add(root);
     int level_count = queue.size();

     while(!queue.isEmpty()){


       while(level_count != 0){

        Node temp = queue.poll();

        if(level_count == 1 && temp != null)
         temp.next = null;
        else if(temp != null)
         temp.next = queue.peek();


        if(temp != null && temp.left != null)
         queue.add(temp.left);

        if(temp != null && temp.right != null)
         queue.add(temp.right); 

        level_count--;  
       }
       level_count = queue.size(); 
     }

     return root;     
    }
}