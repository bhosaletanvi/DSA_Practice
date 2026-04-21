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
	int red=0;
	for(int blue=1;blue<arr.length;blue++){
		if(arr[red]!=arr[blue]){
			red++;
			arr[red]=arr[blue];
		}
	}			
	for(int i =0;i<arr.length;i++){
		System.out.print(" "+arr[i]);
	}

	
}
}