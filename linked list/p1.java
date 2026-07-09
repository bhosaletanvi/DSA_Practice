class node {
	int data;
	node next=null;
}
class demo{
	public static void main(String [] args){
		node first=new node();
		first.data=10;
		System.out.println(first.next);
	}
}