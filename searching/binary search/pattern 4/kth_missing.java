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
		System.out.println("Enter k : ");
		int k = sc.nextInt();
		System.out.println(kth_missing(arr,k));
	}
	static int kth_missing(int[] arr,int k) {
       		int low=0,high=arr.length-1,ans=-1;
		while(low<=high){
			int mid=low+(high-low)/2;
			int missing = arr[mid]-(mid+1);
			if(missing<k){
				low=mid+1;
			}else{
				high=mid-1;
			}
		}
		return low+k;
    }
}