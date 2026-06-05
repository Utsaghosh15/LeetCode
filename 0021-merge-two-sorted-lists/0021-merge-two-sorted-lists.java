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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
      
     ListNode result = new ListNode(-1);
     ListNode temp_result = result;

     while(list1 != null && list2 != null){

      if(list1.val <= list2.val){

        temp_result.next = list1;
        list1 = list1.next;
      }  
      else{
        temp_result.next = list2;
        list2 = list2.next;
      }

      temp_result = temp_result.next;
     }

     while(list1 != null){
      temp_result.next = list1;
      list1 = list1.next;
      temp_result = temp_result.next;
     }

     while(list2 != null){
      temp_result.next = list2;
      list2 = list2.next;
      temp_result = temp_result.next; 
     }

     return result.next;
    }
}