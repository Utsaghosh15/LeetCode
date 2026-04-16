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
    public ListNode swapPairs(ListNode head) {

     if(head == null)
      return null;   

     ListNode result = new ListNode(-1);
     result.next = head;
     ListNode current = result.next;
     ListNode prev = result;

     while(current != null && current.next != null){
      
      ListNode temp = current.next;
      current.next = current.next.next;
      temp.next = current;
      prev.next = temp;
      
      prev = current;
      current = current.next;
     }  

     return result.next;
    }
}