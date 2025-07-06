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

    public ListNode removeElement(ListNode node,int val){

     if(node == null)
      return node;

     node.next = removeElement(node.next,val);

     return (node.val == val) ? node.next : node;    
    }

    public ListNode removeElements(ListNode head, int val) {


    return removeElement(head,val);    

    //  if(head == null)
    //   return head;  

    //  ListNode temp_head = new ListNode(-1);
    //  temp_head.next = head;  

    //  ListNode prev = temp_head;
    //  ListNode curr = head;

    //  while(curr != null){
       
    //   while(curr != null && curr.val == val){
    //    prev.next = curr.next;
    //    curr = curr.next;
    //   }
      
    //   prev = curr; 

    //   if(curr != null)
    //     curr = curr.next;
    //  }   

    //  return temp_head.next;
    }
}