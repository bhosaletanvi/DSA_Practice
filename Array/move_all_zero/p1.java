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
	int [] temp=new int[arr.length];
	int index=0;
	for(int i=0;i<arr.length;i++){
		if(arr[i]!=0){
			temp[index]=arr[i];
			index++;
		}
	}
	for(int i=0;i<temp.length;i++){
		System.out.print(" "+temp[i]);
	}
}
}