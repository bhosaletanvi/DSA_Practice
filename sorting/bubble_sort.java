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
		for(int i =0;i<n-1;i++){
			boolean swapped=false;
			for(int j =0 ;j<n-i-1; j++){
				if(arr[j]>arr[j+1]){
					int temp =arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					swapped = true;			
				}
			}

			if(!swapped){
				break;
			}
		}		
		for(int i =0;i<n;i++){
			System.out.print(" "+arr[i]);
		}
	}			
}	