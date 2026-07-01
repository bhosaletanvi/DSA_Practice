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
		System.out.println("Enter number : ");
		int num = sc.nextInt();
		System.out.println(sqrtRoot(arr,num));
	}
	static int sqrtRoot(int[] arr,int num) {
       		int low=0,high=arr.length-1,ans=-1;
		while(low<high){
			int mid=low+(high-low)/2;
			if((arr[mid]*arr[mid])<=num){
				ans=arr[mid];
				low=mid+1;
			}else{
				high=mid-1;
			}
		}
		return ans;
    }
}