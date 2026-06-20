import java.util.Scanner;
class demo{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Size of Array : ");
		int size = sc.nextInt();
		
		int [] arr = new int[size];
		System.out.print("Enter Elements : ");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		System.out.print("Enter K : ");
		int k = sc.nextInt();
		System.out.print(first_odd(arr,k));		
	}
	static int first_odd(int [] arr,int k){
		int low=0,high=arr.length-1,ans=-1;
		while(low<=high){
			int mid=low+(high-low)/2;
			if(arr[mid]>k){
				ans=mid;
				high=mid-1;
			}else{
				low=mid+1;
			}
		}
		return ans;		
	}
}