import java.util.*;
class demo{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size : ");
		int size= sc.nextInt();
		int [][] arr= new int[size][size];
		System.out.println("Enter Elements ");
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length;j++){
				arr[i][j]=sc.nextInt();
			}
		}
		int sum=0;
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length;j++){
				if(i==j || i+j==arr.length-1){
					sum+=arr[i][j];
				}
			}
		}
		System.out.print(sum);
	}
}