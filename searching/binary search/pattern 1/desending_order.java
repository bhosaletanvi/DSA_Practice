import java.util.*;
class demo{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size : ");
		int size = sc.nextInt();
		int [] arr= new int[size];
		System.out.println("Enter elements : ");	
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter target : ");
		int target = sc.nextInt();
		System.out.print(desending_order(0,arr.length-1,arr,target));
	}
	static int desending_order(int low , int high , int [] arr,int target){
		int count=0;
		if(low>high){
			return -1;
		}
		int mid=low+(high-low)/2;
		if(arr[mid]==target){
			return mid;
		}else if(arr[mid]>target){
			return desending_order(mid+1,high,arr,target);
		}else{
			return desending_order(low,mid-1,arr,target);
		}
	}
}