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
		System.out.println("Enter k value : ");
		int k = sc.nextInt();
		
		k=k%size;
		reversearray(0,k-1,arr);
		reversearray(k,arr.length-1,arr);
		reversearray(0,arr.length-1,arr);
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		
	}
	static void reversearray(int start , int end , int [] arr){
		while(start<end){
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			end--;
			start++;
		}
	}
}