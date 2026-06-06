import java.util.*;
class demo{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st String : ");
		String s1= sc.nextLine();
		System.out.println("Enter 2nd String : ");
		String s2= sc.nextLine();
		System.out.print(safix(s1,s2));	
	}
	
	static boolean safix(String s1, String s2){
		if(s1.length()<s2.length()){
			return false;
		}
		int index=0;
		for(int i=s1.length()-s2.length();i<s1.length();i++){
			if(s1.charAt(i)!=s2.charAt(index)){
				return false;
			}
			index++;
		}
		return true;
	}
}