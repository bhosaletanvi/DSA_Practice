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
		
		System.out.println("Enter target : ");
		int target = sc.nextInt();
		System.out.println("Enter k : ");
		int k = sc.nextInt();
		
		 colsest_element(arr,target,k);
		
	}

static void colsest_element(int [] arr,int target,int k){
		ArrayList<Integer> al = new ArrayList<>();
		int low=0,high=arr.length-1,ans=-1;
		while(low<high){
			int mid=low+(high-low)/2;
			if(arr[mid]>=target){
				ans=mid;
				high=mid-1;
			}else{
				low=mid+1;
			}
		}
		
		int temp=ans;
		int i=k;
		if(arr[ans]==target){
			al.add(arr[ans]);
			k--;
			temp=ans-1;
			i=k;
		}
		while(i>=k/2){
			if(temp<0){
				break;
			}
			al.add(arr[temp]);
			temp--;
			i--;
		}
		temp=ans+1;
		while(i>=1){
			if(temp>arr.length-1){
				break;
			}
			al.add(arr[temp]);
			temp++;
			i--;
		}
		System.out.println(al);
	}
		
		
}