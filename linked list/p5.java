import java.util.*;
class node{
	int data;
	node next;
}

class demo{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		
		node first = new node();
		first.data=10;
		first.next=null;
			
		node second = new node();
		second.data=20;
		second.next=null;
		first.next=second;

		node third = new node();
		third.data=30;
		third.next=null;
		second.next=third;
	
		node fourth = new node();
		fourth.data=40;
		fourth.next=null;
		third.next = fourth;

		int sum=0;
		node temp=first;
		while(temp!=null){
			sum+=temp.data;
			temp=temp.next;
		}
		System.out.println(sum);
	}
}