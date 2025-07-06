/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {

    public ListNode ReverseLinkedList(ListNode node){

     if(node == null)
      return node;

     ListNode prev = null;
     ListNode curr= node;
     ListNode nxt = null;

     while(curr != null){

      nxt = curr.next;
      curr.next = prev;
      prev = curr;
      curr = nxt;  
     } 

     return prev;   
    }

    public boolean isPalindrome(ListNode head) {

     ListNode slow = head;
     ListNode fast = head;

     while(fast != null && fast.next != null){
      slow = slow.next;
      fast = fast.next.next;  
     }

     ListNode reverse_node = ReverseLinkedList(slow);
     fast = head;

     while(reverse_node != null){
  
      if(fast.val != reverse_node.val)
        return false;

      fast = fast.next;
      reverse_node = reverse_node.next;
     } 

     return true;  
    }
}