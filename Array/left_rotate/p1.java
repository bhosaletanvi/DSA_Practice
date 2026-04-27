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
	int first=arr[0];
	for(int i =0; i<arr.length-1;i++){
		arr[i]=arr[i+1];
	}
	arr[arr.length-1]=first;
	
	for(int i =0; i<arr.length;i++){
		System.out.print(" "+arr[i]);
	}

}
}