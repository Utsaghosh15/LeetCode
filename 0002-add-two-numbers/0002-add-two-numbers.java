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
    
   ListNode result_list = new ListNode(-1);
   ListNode result_list_temp = result_list;
   int carry = 0;

   while(l1 != null && l2 != null){

    ListNode new_node = new ListNode((l1.val+l2.val+carry)%10);
    result_list_temp.next = new_node;
    carry = (l1.val+l2.val+carry)/10;
    l1 = l1.next;
    l2 = l2.next;
    result_list_temp = result_list_temp.next;
 
   }

   while(l1 != null){

    ListNode new_node = new ListNode((l1.val+carry)%10);
    result_list_temp.next = new_node;
    carry = (l1.val+carry)/10;
    l1 = l1.next;
    result_list_temp = result_list_temp.next;
   }

   while(l2 != null){

    ListNode new_node = new ListNode((l2.val+carry)%10);
    result_list_temp.next = new_node;
    carry = (l2.val+carry)/10;
    l2 = l2.next;
    result_list_temp = result_list_temp.next;
   }

   if(carry != 0){

    ListNode new_node = new ListNode(carry%10);
    result_list_temp.next = new_node; 
   }

   return result_list.next; 
  }
}