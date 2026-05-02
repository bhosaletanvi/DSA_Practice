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
	int index=0;
	int j=-1;
	for(int i=0;i<arr.length;i++){
		if(arr[i]!=0){
			j=i;
			break;
		}
	}
	for(int i=j+1;i<=arr.length-1;i++){
		if(arr[i]!=0){
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			j++;
		}
	}
	for(int i=0;i<=arr.length-1;i++){
		System.out.print(" "+arr[i]);
	}
	
}
}