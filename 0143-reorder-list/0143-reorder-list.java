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

    public ListNode reverse(ListNode head){
     
     ListNode prev = null;
     ListNode curr = head;
     ListNode nextNode = null;

     while(curr != null){

      nextNode = curr.next;
      curr.next = prev;
      prev = curr;
      curr = nextNode;  
     }

     return prev;
    }

    public void reorderList(ListNode head) {
     
      ListNode slow = head;
      ListNode fast = head;

      while(fast != null && fast.next != null){
        fast = fast.next.next;
        slow = slow.next;
      }

      ListNode secondHalfHead = slow.next;
      slow.next = null;

      ListNode reversedSecond = reverse(secondHalfHead);

      ListNode first = head;
      ListNode second = reversedSecond;

      while(second != null){

        ListNode firstNext = first.next;
        ListNode secondNext = second.next;

        first.next = second;
        second.next = firstNext;

        first = firstNext;
        second = secondNext;
      }
     
    }
}