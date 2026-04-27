import java.util.*;
class demo {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Array Size : ");
        int size =sc.nextInt();
	int [] arr=new int [size];
	System.out.print("Enter Array Elements : ");
	for(int i =0; i<arr.length;i++){
		arr[i]=sc.nextInt();
	}
	System.out.print("Enter rotate value : ");
        int k =sc.nextInt();

	left_rotate(arr,k);
		
}
	public static void left_rotate(int [] arr , int k){
	int n=arr.length;
	k=k%n;
	
	reverseArray(arr,0,k-1);
	reverseArray(arr,k,arr.length-1);
	reverseArray(arr,0,n-1);
	for(int i =0; i<arr.length;i++){
		System.out.print(" "+arr[i]);
	}
	}
	public static void reverseArray(int[] arr, int start, int end){
		while(start<end){
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
	
	}

}