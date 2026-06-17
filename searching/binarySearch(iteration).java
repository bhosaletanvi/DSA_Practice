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
		int pos=-1;
		int low=0,high=arr.length-1;
		while(low<high){
			int mid=low+(high-low)/2;
			if(arr[mid]==target){
				pos=mid;
				break;
			}else if(arr[mid]<target){
				low=mid+1;
			}else{
				high=mid-1;
			}	
		}
		System.out.print(pos);
	}
}