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
		int max=0,profit=Integer.MIN_VALUE;
		for(int j=0;j<arr.length-1;j++){
			for(int k=j+1;k<arr.length-1;k++){
				profit=arr[k]-arr[j];
				max=Math.max(max,profit);
			}
		}
		System.out.print(max);		
	}
}