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
    public ListNode reverseList(ListNode head) {
        ListNode prev= new ListNode();
        ListNode temp= new ListNode();
        ListNode front= new ListNode();
        prev=null;
        temp=head;
        front=temp;
        while(front!=null){
            front=front.next;
            temp.next=prev;
            prev=temp;
            temp=front;
        }
        return prev;
    }
}