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
        ListNode temp1 = list1;
		ListNode temp2 = list2;

		ListNode abc = new ListNode();
		ListNode temp3=abc;

		while(temp1!=null && temp2!=null){
			if(temp1.val>temp2.val){
                ListNode dummy = temp2;
				temp3.next=temp2;
				temp2=temp2.next;
                dummy.next=null;
			}else{
				temp3.next=temp1;
                ListNode dummy = temp1;
				temp1=temp1.next;
                dummy.next=null;

			}
			temp3=temp3.next;
		}

		while(temp1!=null ){		
			temp3.next=temp1;
			temp1=temp1.next;
			temp3=temp3.next;
		}
		while( temp2!=null){
			temp3.next=temp2;
			temp2=temp2.next;
			temp3=temp3.next;
		}
		return abc=abc.next;
    }
}