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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode slow = list1;
        ListNode fast=list1;
        while(a!=1){
            slow=slow.next;
            a--;
        }
        while(b!=0){
            fast=fast.next;
            b--;
        }
        slow.next=list2;
        ListNode temp = list2;
        while(temp.next!=null){
            temp=temp.next;
        }
        ListNode dummy = fast;
        temp.next=fast.next;
        dummy.next=null;
        return list1;
    }
}