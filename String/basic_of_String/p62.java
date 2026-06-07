import java.util.*;
class demo{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String s= sc.nextLine();
		System.out.print(first_repeating(s));
	}
	static char first_repeating(String s){
		int [] freq = new int[26];
		for(int i=0;i<s.length();i++){
			freq[s.charAt(i)-'a']++;
		}
		for(int i=0;i<s.length();i++){
			
			if(freq[s.charAt(i)-'a']==1){
				return s.charAt(i);
			}
		}		
		return ' ';		
	}
}