import java.util.Scanner;
class demo{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number : ");
		System.out.println();
		int num=sc.nextInt();
		for(int i=1;i<=num;i++){
			for(int j=num-1;j>=i;j--){
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++){
				System.out.print(k+" ");
			}
			System.out.println();
		}
	
	}
}