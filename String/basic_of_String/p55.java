import java.util.*;
class demo{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String s= sc.nextLine();
		System.out.print(all_digits(s));
	}
	static boolean all_digits(String s){
		if(s.length()<26){
			return false;
		}	
		int count=0;
		int alphabet=97;
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)==(char)(alphabet)){
				count++;
				alphabet++;
			}
			if(count==26){
				return true;
			}
		}
		return false;		
	}
}