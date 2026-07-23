import java.util.*;
class node{
	int data;
	node next;
}

class demo{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		
		node first = new node();
		first.data=9;
		first.next=null;
			
		node second = new node();
		second.data=10;
		second.next=null;
		first.next=second;

		node third = new node();
		third.data=20;
		third.next=null;
		second.next=third;
	
		node fourth = new node();
		fourth.data=0;
		fourth.next=null;

		node fifth = new node();
		fifth.data=10;
		fifth.next=null;
		fourth.next = fifth;

		node temp1 = first;
		node temp2 = fourth;

		node abc = new node();
		node temp3=abc;

		while(temp1!=null && temp2!=null){
			if(temp1.data>temp2.data){
				temp3.next=temp2;
				temp2=temp2.next;
			}else{
				temp3.next=temp1;
				temp1=temp1.next;

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
		abc=abc.next;
		while(abc!=null){
			System.out.print(abc.data+" ");
			abc=abc.next;
		}
	}
}