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
		System.out.print(binarySearch(0,arr.length-1,arr,target));
	}
	static int binarySearch(int low , int high , int [] arr,int target){
		if(low>high){
			return -1;
		}
		int mid=low+(high-low)/2;
		if(arr[mid]==target){
			return mid;
		}else if(arr[mid]>target){
			return binarySearch(0,mid-1,arr,target);
		}else{
			return binarySearch(mid+1,arr.length-1,arr,target);

		}
	}
}