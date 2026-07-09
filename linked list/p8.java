import java.util.*;
class node{
	int data;
	node next;
}

class demo{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		
		node first = new node();
		first.data=1;
		first.next=null;
			
		node second = new node();
		second.data=2;
		second.next=null;
		first.next=second;

		node third = new node();
		third.data=3;
		third.next=null;
		second.next=third;
	
		node fourth = new node();
		fourth.data=4;
		fourth.next=null;
		third.next = fourth;

		int max=Integer.MIN_VALUE;
		node temp=first;
		while(temp!=null){
			if(max<temp.data){
				max=temp.data;
			}
			temp=temp.next;
		}
		System.out.println(max);		 
	}
}