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
		System.out.print(countCom(0,arr.length-1,arr,target));
	}
	static int countCom(int low , int high , int [] arr,int target){
		int count=0;
		if(low>high){
			return count;
		}
		int mid=low+(high-low)/2;
		if(arr[mid]==target){
			count++;
			count+=countCom(0,mid-1,arr,target);
			count+=countCom(mid+1,arr.length-1,arr,target);
			return count;
		}
		return count;
	}
}