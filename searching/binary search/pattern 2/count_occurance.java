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
		System.out.println(CountOccurance(0,arr.length-1,target,arr));		
	}
	static int CountOccurance(int low,int high , int target,int [] arr){
		if(low>high){
			return 0;
		}
		int count=0;
		int mid=low+(high-low)/2;
		if(arr[mid]==target){
			count++;
			count+=CountOccurance(low,mid-1,target,arr);
			count+=CountOccurance(mid+1,high,target,arr);
			return count;

		}else if(arr[mid]>target){
			return CountOccurance(low,mid-1,target,arr);
		}else{
			return CountOccurance(mid+1,high,target,arr);

		}
		
	}
}