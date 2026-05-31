import java.util.Scanner;
class demo{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number : ");
		int num=sc.nextInt();
		int original=num,sum=0,even=0,odd=0;
		while(num!=0){
			int digit=num%10;
			sum+=digit;
			if(digit%2==0){
				even++;
			}else{
				odd++;
			}
			num/=10;
		}
		if(original%sum==0){
			System.out.print("\nHarshad Number");
		}else{
			System.out.print("\nNot Harshad Number");
		}
		System.out.print("\nEven Number Count : "+even);
		System.out.print("\nOdd Number Count : "+odd);

	
	}
}