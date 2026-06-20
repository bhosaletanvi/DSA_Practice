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
		System.out.print(first_true(0,arr.length-1,arr));		
	}
	static int first_true(int low,int high,int [] arr){
		if(low>high){
			return -1;
		}
		int mid = low+(high-low)/2;
		if(arr[mid]==1){
			int ans=mid;
			int temp=first_true(low,mid-1,arr);
			if(temp!=-1){
				return temp;
			}else{
				return ans;
			}
		}else{
			return first_true(mid+1,high,arr);
		}
	}
}