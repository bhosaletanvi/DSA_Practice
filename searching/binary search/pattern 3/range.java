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

		System.out.println("Enter element : ");
		int element = sc.nextInt();
		int [] ans = new int[2];
		System.out.print(Arrays.toString(count_occurance(arr,element)));
	}
		
	static int[] count_occurance(int [] arr, int element){
		int [] temp = new int[2];
		int low=0,high=arr.length-1,ans=-1;
		while(low<=high){
			int mid=(low+high)/2;
			if(arr[mid]==element){
				temp[0]=mid;
				high=mid-1;
			}else{
				low=mid+1;
			}
		}
		low=0;
		high=arr.length-1;
		ans=-1;
		while(low<=high){
			int mid=(low+high)/2;
			if(arr[mid]==element){
				temp[1]=mid;
				low=mid+1;
			}else if(arr[mid]>element){
				high=mid-1;
			}else{
				low=mid+1;
			}
		}		
		return temp;
	}
}