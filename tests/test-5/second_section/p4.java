import java.util.*;
class demo{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int count=1,max=0;
		HashMap <Integer , Integer> hm = new HashMap<>();
		System.out.println("Enter size : ");
		int size = sc.nextInt();
		int [] arr= new int[size];
		System.out.println("Enter elements : ");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter k value : ");
		int k = sc.nextInt();
		
		int temp=arr[0];
		int last = arr[k];
		for(int i=0;i<k;i++){
			arr[k+i]=arr[i];
			arr[i]=arr[k+i+1];
			arr[k+i+1]=arr[i+1];
		}
		arr[k]=temp;
		arr[arr.length-1]=last;
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		
	}
}