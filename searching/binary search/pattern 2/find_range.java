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
		int [] ans = {-1,-1};
		ans=find_range(0,arr.length-1,target,arr);
		System.out.println(Arrays.toString(ans));		
	}
	static int[] find_range(int low,int high , int target,int [] arr){
		int [] ans = {-1,-1};
		if(low>high){
			return ans;
		}
		int [] temp= new int[2];
		int count=0;
		int mid=low+(high-low)/2;
		if(arr[mid]==target){
			ans[0]=mid;
			ans[1]=mid;
			temp=find_range(low,mid-1,target,arr);
			if(temp[0]!=-1){
				ans[0]=temp[0];
			}
			temp=find_range(mid+1,high,target,arr);
			if(temp[1]!=-1){
				ans[1]=temp[1];
			}
			return ans;

		}else if(arr[mid]>target){
			return find_range(low,mid-1,target,arr);
		}else{
			return find_range(mid+1,high,target,arr);

		}
		
	}
}