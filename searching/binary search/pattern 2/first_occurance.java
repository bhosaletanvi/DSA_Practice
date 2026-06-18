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
		System.out.println(firstOccurance(0,arr.length-1,target,arr));		
	}
	static int firstOccurance(int low ,int high ,int target , int [] arr){
		if(low>high){
			return -1;
		}
		int temp=-1;
		int mid = low+(high-low)/2;
		if(arr[mid]==target){
			int ans=mid;
			temp=firstOccurance(low,mid-1,target,arr);
			if(temp==-1){
				return mid;
			}else{
				return temp;
			}
		}else if(arr[mid]>target){
			return firstOccurance(low,mid-1,target,arr);
		}else{
			return firstOccurance(mid+1,high,target,arr);
		}
	}
}