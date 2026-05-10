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
		int currentsum=1,max=Integer.MIN_VALUE;
		for(int i =0;i<arr.length;i++){
			currentsum*=arr[i];
			max=Math.max(currentsum,max);
			if(currentsum<0 && arr[arr.length-1]>0){
				currentsum=1;
			}
		}		
		System.out.print(max);
	}
}