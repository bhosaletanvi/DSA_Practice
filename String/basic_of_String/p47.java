import java.util.*;
class demo{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String s= sc.nextLine();
		Scanner ans = new Scanner(System.in);
		String[] words = s.split(" ");

		for(int i=0;i<words.length;i++){
			for(int j=words[i];j>=0;j--){
				ans.append(words[j]);
		}
			sb.append(" ");
		}

		System.out.print(ans);		
	}
}