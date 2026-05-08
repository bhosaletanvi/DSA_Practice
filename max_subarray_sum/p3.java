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
		int max=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++){
			currentsum+=arr[i];
			max=Math.max(max,currentsum);
			if(currentsum<0){
				currentsum=0;
			}			
		}
		System.out.println(max);
	}
}