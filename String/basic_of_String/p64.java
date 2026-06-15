import java.util.*;
class demo{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String 1 : ");
		String s1 = sc.next();
		System.out.println("Enter String 2 : ");
		String s2 = sc.next();
		int i=0;
		StringBuilder sb = new StringBuilder();
		for( i=0;i<s1.length();i++){
			sb.append(s1.charAt(i));
			sb.append(s2.charAt(i));
		}
		
		while(i<s2.length()){
			sb.append(s2.charAt(i));
			i++;

		}
		System.out.print(sb);
		
	}
}