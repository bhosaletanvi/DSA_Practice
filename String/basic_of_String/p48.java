import java.util.*;
class demo{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String s= sc.nextLine();
		String[] words = s.split(" ");
		StringBuilder sb = new StringBuilder();
		for(int i=words.length-1;i>=0;i--){
			sb.append(words[i]);
			sb.append(" ");
		}
		System.out.print(sb);		
	}
}