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
	int num = arr.length+1;
	for(int i =num;i>=1;i--){
		int count=0;
		for(int j=0;j<arr.length;j++){
			if(arr[j]==i){
				count++;
			}
		}	
		if(count==0){
			System.out.println(i);
			break;	
		}
				
	}
}
}