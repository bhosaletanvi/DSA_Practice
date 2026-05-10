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
		int start=0,end=0;
		int max=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++){
			for(int j=i;j<arr.length;j++){
				int sum=0;
				for(int k=i;k<=j;k++){
					sum+=arr[k];
					if(arr[k]<0){
					break;
				}

				}
				max=Math.max(max,sum);
				if(max==sum){
					start=i;
					end=j;
				}
			}
		}
		System.out.println(max);
		System.out.print("SubArray :");
		for(int k=start;k<=end;k++){
			System.out.print(" "+arr[k]);
		}

	}
}