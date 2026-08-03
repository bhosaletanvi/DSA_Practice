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
    public void reorderList(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev=head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            prev=slow;
            slow=slow.next;
        }
       
       ListNode temp1=head;
       ListNode temp2=reverse(slow);
        ListNode front1=null;
       ListNode front2=null;
       while(temp2.next!=null){
            front1=temp1.next;
            front2=temp2.next;
            temp1.next=temp2;
            temp2.next=front1;
            temp1=front1;
            temp2=front2;

       }
    }
    static ListNode reverse(ListNode head){
        ListNode prev=null;
        ListNode temp = head;
        ListNode front=temp;
        while(temp!=null){
           
            front=front.next;
            temp.next=prev;
            prev=temp;
            temp=front;
        }
        return prev;
    }
     
}