class node {
	int data;
	node next;
}

class demo{
	public static void main(String [] args){
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

		node fifth = new node();
		fifth.data=5;
		fifth.next=null;
		fourth.next = fifth;
		node dummy = first;

	node even=null;
        node odd=null;
        node evenend=null;
        node oddend=null;
        node temp=first;
        while(temp!=null){
            if(temp.data%2==0){
                if(even==null){
                    even=temp;
                    evenend=temp;
                }else{
                    evenend.next=temp;
                    evenend=evenend.next;
                }
            }else{
                if(odd==null){
                    odd=temp;
                    oddend=temp;
                }else{
                    odd.next=temp;
                    oddend=oddend.next;
                }
            }
        }
        evenend.next=odd;
		while(even!=null){
			System.out.print(even.data+" ");

			even=even.next;
		}
	}
}
