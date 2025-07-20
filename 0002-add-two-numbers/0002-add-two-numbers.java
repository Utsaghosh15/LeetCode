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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {   

     int carry = 0;
     int total = 0;
     ListNode result_temp = new ListNode(-1);
     ListNode result = result_temp;

     while(l1 != null || l2 != null || carry != 0){

      total = carry;

      if(l1 != null){
        total+=l1.val;
        l1 = l1.next;
      }

      if(l2 != null){
        total+=l2.val;
        l2 = l2.next;
      }

      result_temp.next = new ListNode(total%10);
      carry = total /10;
      result_temp = result_temp.next;
     }

     return result.next;
    }
}