import java.util.Scanner;
class demo{
	public static void main(String [] args){
		Scanner sc =new Scanner(System.in);
		System.out .print("Enter size of array : ");
		int size =sc.nextInt();
		int [] arr=new int[size];
		System.out .print("Enter array element : ");
		for(int i =0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		int n=arr.length;
		for(int i=0;i<n-1;i++){
			int min_index=i;
		 	for(int j=i+1;j<n;j++){
				if(arr[j]<arr[min_index]){
					min_index=j;
				}
			}	
					int temp=arr[i];
					arr[i]=arr[min_index];
					arr[min_index]=temp;
				
			}
		for(int i =0 ;i<n;i++){
			System.out.print(" "+arr[i]);
		}
	}			
}	