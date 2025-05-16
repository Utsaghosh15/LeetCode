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

     ListNode l1_temp = l1;
     ListNode l2_temp = l2;
     ListNode result = new ListNode(-1);
     ListNode result_temp = result;
     int carry = 0;


     while(l1_temp != null || l2_temp != null || carry != 0){

      int sum = carry;

      if(l1_temp != null){
        sum+=l1_temp.val;
        l1_temp = l1_temp.next;
      }

      if(l2_temp != null){
        sum+=l2_temp.val;
        l2_temp = l2_temp.next;
      }
      
      carry = sum/10;
      ListNode temp = new ListNode(sum%10); 
      result_temp.next = temp;
      result_temp = result_temp.next; 
     }
     
     return result.next;
    }
}