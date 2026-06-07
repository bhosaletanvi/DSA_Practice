import java.util.*;
class demo{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String s= sc.nextLine();
		System.out.print(first_non_repeating(s));
	}
	static char first_non_repeating(String s){
		int count=0;
		for(int i=0;i<s.length();i++){
			for(int j=0;j<s.length();j++){
				if(s.charAt(i)==s.charAt(j)){
					count++;
				}
			}
			if(count==1){
				return s.charAt(i);
			}
			count=0;
		}
		return ' ';		
	}
}