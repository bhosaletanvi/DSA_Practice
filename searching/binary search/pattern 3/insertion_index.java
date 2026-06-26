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

		System.out.print(Insertion_index(arr,element));
	}
		
	 static int Insertion_index(int[] arr, int target) {
        int low=0,high=arr.length-1,ans=-1;
        while(low<high){
            int mid = (low+high)/2;
            if(arr[mid]>=target){
		System.out.println(arr[mid]);
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }
}