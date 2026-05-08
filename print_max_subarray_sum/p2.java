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
		
		int max=Integer.MIN_VALUE;
		int sum=0,start=0,end=0,e=0;
		for(int i=0;i<arr.length;i++){
			sum=0;
			for(int j=arr.length-1;j>=i;j--){
				sum+=arr[j];
				if(arr[j]<0){
					break;
				}

				end=j;
			}
			max=Math.max(max,sum);
			if(max==sum){
				start=i;
				}

		}		
		System.out.println(max);
		System.out.print("SubArray :");
		for(int k=start;k<=end;k++){
			System.out.print(" "+arr[k]);
		}

	}
}