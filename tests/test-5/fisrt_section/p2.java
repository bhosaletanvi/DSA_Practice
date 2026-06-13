import java.util.*;
class demo{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String s= sc.nextLine();
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)>=97 && s.charAt(i)<=122){
				sb.append(s.charAt(i));
			}else if(s.charAt(i)>=65 && s.charAt(i)<=90){
				char ch = (char)(s.charAt(i)+32);
				sb.append(ch);
			}
		}
		String ans= sb.toString();
		sb.reverse();
		String rev=sb.toString();
		

		if(ans.equals(rev)){
			System.out.println("true");
		}else{
			System.out.println("false");
		}		
	}
}