import java.util.*;
class demo{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String s= sc.nextLine();
		String[] words = s.split(" ");
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<words.length;i++){
		StringBuilder temp = new StringBuilder();
			temp.append(words[i]);
			sb.append(temp.reverse());
			sb.append(" ");
		}
		System.out.print(sb);		
	}
}