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
	int [] freq =new int [arr.length+1];
	for(int i =0;i<arr.length;i++){
		freq[arr[i]]++;
	}
	
	for(int i=1;i<freq.length;i++){
		if(freq[i]==0){
			System.out.println(i+" missing ");
		}
	}
}
}