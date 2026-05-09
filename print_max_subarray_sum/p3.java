import java.util.*;
class demo{
	public static void main(String [] args){
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter array size  : ");
		int size = sc.nextInt();
		int [] arr= new int[size];
		System.out.print("Enter array elements : ");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		int currentsum=0;
		int start=0,end=0;
		int max=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++){
			currentsum+=arr[i];
			max=Math.max(max,currentsum);
			if(max==currentsum){
				end=i;
			}
			
			if(currentsum<0 || arr[i]<0){
				currentsum=0;
				end=i;
			}			
		}
		System.out.println(max);
		System.out.print("SubArray :");
		for(int k=start;k<=end;k++){
			System.out.print(" "+arr[k]);
		}

	}
}