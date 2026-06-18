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
		System.out.println(checkTaregt(0,arr.length-1,target,arr));		
	}
	static boolean checkTaregt(int low ,int high ,int target , int [] arr){
		if(low>high){
			return false;
		}
		int mid = low+(high-low)/2;
		if(arr[mid]==target){
			return true;
		}else if(arr[mid]>target){
			return checkTaregt(low,mid-1,target,arr);
		}else{
			return checkTaregt(mid+1,high,target,arr);
		}
	}
}