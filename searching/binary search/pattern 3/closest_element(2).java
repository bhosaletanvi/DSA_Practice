import java.util.*;
class demo{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array Size : ");
		int size = sc.nextInt();
		int [] arr = new int[size];
		System.out.print("Enter array element : ");
		for(int i = 0; i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Enter target : ");
		int target = sc.nextInt();
		
		int ans =colsest_element(arr,target);
			
		System.out.print(ans);
	}

static int colsest_element(int [] arr,int target){
		int low=0,high=arr.length-1,ans=-1;
		while(low<high){
			int mid=low+(high-low)/2;
			if(arr[mid]>=target){
				ans=mid;
				high=mid-1;
			}else{
				low=mid+1;
			}
		}
		if(ans==-1){
			return -1;
		}
		if(arr[ans]==target){
			return arr[ans];
		}
		int left=arr[ans-1];
		int right = arr[ans];
		if((target-left)<=(right-target)){
			return left;
		}else{
			return right;
		}
	}	
		
}