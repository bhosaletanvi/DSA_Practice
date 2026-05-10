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
		int low=arr[0],max=Integer.MIN_VALUE,profit=0;
		for(int i=0;i<arr.length-1;i++){
			low =Math.min(low,arr[i]);			
			profit=arr[i]-low;
			max=Math.max(profit,max);
			}
		
		System.out.print(max);		
	}
}