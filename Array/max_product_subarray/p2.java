import java.util.*;
class demo{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array Size : ");
		int size = sc.nextInt();
		int [] arr = new int[size];
		System.out.print("Enter array element : ");
		for(int i = 0; i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		int sum=1,max=Integer.MIN_VALUE;
		for(int i =0;i<arr.length;i++){
			sum=1;
			for(int j=i;j<arr.length-1;j++){
				sum*=arr[j];
				//if((arr[j]<0 && sum>0) || (arr[j]>0 && sum<0)){
				if(arr[arr.length-1]<0 && sum<0){	
					sum=1;
				}
			}
			max=Math.max(sum,max);
			
		}		
		System.out.print(max);
	}
}