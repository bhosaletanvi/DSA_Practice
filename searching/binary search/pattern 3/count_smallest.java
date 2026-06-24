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

		System.out.print(ceiling(arr,element));
	}
		
	static int ceiling(int [] arr,int element){
		int low=0,high=arr.length-1,ans=-1,mid=0;
		while(low<=high){
			mid=(low+high)/2;
			if(arr[mid]>element){
				high=mid-1;
			}else{
				low=mid+1;
			}
		}		
		return mid;
	}
}