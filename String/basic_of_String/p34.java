import java.util.*;
class demo{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String s= sc.nextLine();
		int count=0;
		int max=97;
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)>=max){
				max=s.charAt(i);
			}
		}
		System.out.println((char)(max));
	}
}