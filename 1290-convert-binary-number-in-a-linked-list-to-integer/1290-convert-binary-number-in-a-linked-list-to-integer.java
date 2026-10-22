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
    public int getDecimalValue(ListNode head) {
        ListNode current = head;
        Stack<Integer> stack = new Stack<>();
        while (current != null) {
            stack.add(current.val);
            current = current.next;
        }
        int sum = 0;
        int index = 0;
        while (!stack.isEmpty()) {
            if (stack.pop() == 1) {
                sum = sum + (int)Math.pow(2, index);
            }
            index++;
        }
        return sum;
    }
}