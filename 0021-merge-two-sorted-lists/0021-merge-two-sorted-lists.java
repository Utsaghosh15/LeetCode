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

     ListNode list1_temp = list1;
     ListNode list2_temp = list2;
     ListNode result = new ListNode(-1);
     ListNode result_temp = result;

     while(list1_temp != null && list2_temp != null){

      if(list1_temp.val > list2_temp.val){
       result.next = list2_temp;
       list2_temp = list2_temp.next;
      }
      else{
       result.next = list1_temp;
       list1_temp = list1_temp.next;
      }  

      result = result.next;
     }

     if(list1_temp != null){
       result.next = list1_temp; 
     }

     if(list2_temp != null){
       result.next = list2_temp;     
     }

     return result_temp.next;
    }
}