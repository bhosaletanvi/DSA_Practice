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
    public ListNode rotateRight(ListNode head, int k) {
        
        int size=0;
        ListNode temp=head;
        while(temp!=null){
            size++;
            temp=temp.next;
        }
        if(size==0 ){
            return head;
        }
        k=k%size;
        int dist=size-k;
        temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=head;
        while(dist!=0){
            temp=temp.next;
            dist--;
        }
        ListNode ans = temp.next;
        temp.next=null;
        return ans;
    }
}