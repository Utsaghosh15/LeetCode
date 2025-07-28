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

    public ListNode reverse(ListNode node){


     if(node == null)
      return node;

     ListNode curr = node;
     ListNode prev = null;
     ListNode nxt = null;

     while(curr != null){
      nxt = curr.next;
      curr.next = prev;
      prev = curr;
      curr = nxt;
     }    

     return prev;
    }

    public void reorderList(ListNode head) {

     ListNode fast = head;
     ListNode slow = head;

     while(fast != null && fast.next != null){

      fast = fast.next.next;
      slow = slow.next;  
     }

     ListNode reverse_slow = reverse(slow);
     int count = 2;
     fast = head;

     while(reverse_slow != null && reverse_slow != fast){

      if(count%2 == 0){
       ListNode temp_fast = fast.next; 
       fast.next = reverse_slow;
       fast = temp_fast;
      } 
      else{
       ListNode temp_reverse_slow = reverse_slow.next; 
       reverse_slow.next = fast;
       reverse_slow = temp_reverse_slow;
      } 
      count++;
     }
    }
}