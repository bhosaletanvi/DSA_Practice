import java.util.*;
class demo{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String s= sc.nextLine();
		System.out.println("Enter Character : ");
		char ch= sc.next().charAt(0);

		System.out.print(firstOccurance(s,ch));		
	}
	static int firstOccurance(String s,char ch){
		if(s.length()==0){
			return -1;
		}
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)==ch){
				return i;
			}
		}
		return -1;
	}
}