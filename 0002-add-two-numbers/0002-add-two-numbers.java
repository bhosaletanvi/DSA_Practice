// /**
//  * Definition for singly-linked list.
//  * public class ListNode {
//  *     int val;
//  *     ListNode next;
//  *     ListNode() {}
//  *     ListNode(int val) { this.val = val; }
//  *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//  * }
//  */
// class Solution {
//     public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//         long first = getNo(l1);
//         long second=getNo(l2);
//         return addition(first+second);
//     }
//     static long getNo(ListNode head){
//         int power = 0;
//         long num=0;
//         while(head!=null){
//             num+=head.val*Math.pow(10,power);
//             head=head.next;
//             power++;
//         }
//         return num;
//     }
//     static ListNode addition(long num){
//         ListNode prev=null;
//         ListNode head = prev; 
//        if(num==0){
//         ListNode temp =new ListNode();
//         temp.val=(int)num;
//         return temp;
//        }
//         while(num!=0){
//             long digit = num%10;
//             ListNode temp = new ListNode();
//             temp.val=(int)digit;
//             if(prev==null){
//                 prev=temp;
//                 head=prev;
//             }else{
//                 prev.next=temp;
//                 prev=prev.next;
//             }
//             num/=10;
//         }
//         return head;
//     }
// }
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode();
        ListNode res = dummy;
        int total = 0, carry = 0;

        while (l1 != null || l2 != null || carry != 0) {
            total = carry;

            if (l1 != null) {
                total += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                total += l2.val;
                l2 = l2.next;
            }

            int num = total % 10;
            carry = total / 10;
            dummy.next = new ListNode(num);
            dummy = dummy.next;
        }

        return res.next;        
    }
}