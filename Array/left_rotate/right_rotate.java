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
	System.out.print("Enter K : ");
        int k =sc.nextInt();
	int n=arr.length;
	k=k%n;

	int [] temp=new int[arr.length];
	for(int i=0;i<=n-k-1;i++){
		temp[k+i]=arr[i];
	}
	for(int i=k+1;i<arr.length;i++){
		temp[i-k-1]=arr[i];
	}

	for(int i=0;i<temp.length;i++){
		System.out.print(" "+temp[i]);
	}
}
}