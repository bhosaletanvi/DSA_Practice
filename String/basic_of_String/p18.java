import java.util.*;
class demo{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String s= sc.nextLine();
		int count=0;
		for(int i=0;i<s.length();i++){
			count++;
		}
		System.out.println(count);
	}
}