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
	int array_sum=0,n=arr.length+1;
	for(int i =0;i<arr.length;i++){
		array_sum+=arr[i];
	}	
	int sum=(n*(n+1))/2;
	System.out.print(sum-array_sum+" is missing");
}
}