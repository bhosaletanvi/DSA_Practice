import java.util.*;
class demo{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String s= sc.nextLine();
		System.out.print(all_digits(s));
	}
	static boolean all_digits(String s){
		if(s.length()<10){
			return false;
		}	
		int add=0;
		int count=0;
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)>=48 && s.charAt(i)<=57){
				add+=s.charAt(i);
			}
			if(s.charAt(i)==48){
				count++;
			}
		}
		if(add>=45 && count>0){
			return true;
		}
		return false;		
	}
}