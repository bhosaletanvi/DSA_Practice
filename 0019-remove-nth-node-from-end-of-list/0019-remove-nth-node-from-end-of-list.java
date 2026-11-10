
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        if(head.next == null){
            return null;
        }

        ListNode fast = head;
        ListNode slow = head;

        while(n > 0){
            fast = fast.next;
            n--;
        }

        // Remove the first node
        if(fast == null){
            return head.next;
        }

        while(fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }

        ListNode temp = slow.next;
        slow.next = slow.next.next;
        temp.next = null;

        return head;
    }
}
