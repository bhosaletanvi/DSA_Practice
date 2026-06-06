import java.util.*;
class demo{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st String : ");
		String s1= sc.nextLine();
		System.out.println("Enter 2nd String : ");
		String s2= sc.nextLine();
		System.out.print(equalsTo(s1,s2));	
	}
	
	static boolean equalsTo(String s1, String s2){
		if(s1.length()!=s2.length()){
			return false;
		}
		for(int i=0;i<s2.length();i++){
			if(s1.charAt(i)!=s2.charAt(i)){
				return false;
			}
		}
		return true;
	}
}