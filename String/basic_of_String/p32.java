import java.util.*;
class demo{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String s= sc.nextLine();
		int count=0;
		for(int i=0;i<s.length();i++){
			if(!(s.charAt(i)>=65 && s.charAt(i)<=90) && !(s.charAt(i)>=97 && s.charAt(i)<=122)  && !(s.charAt(i)>=48 && s.charAt(i)<=57) && s.charAt(i)==32){
				count++;
			}
		}
		System.out.println(count);
	}
}