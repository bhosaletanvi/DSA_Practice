import java.util.*;
class demo{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String s= sc.nextLine();
		int [] freq = new int[26];
		for(int i=0;i<s.length();i++){
			freq[s.charAt(i)-'a']++;
		}
		for(int i=0;i<freq.length;i++){
			if(freq[i]!=0){
				System.out.println((char)('a'+i)+" -> "+freq[i]);
			}
		}
	}
}