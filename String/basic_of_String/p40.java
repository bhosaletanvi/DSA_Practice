import java.util.*;
class demo{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String s= sc.nextLine();
		int count=0;
		String ans= "";
		for(int i=0;i<s.length();i++){
			if((s.charAt(i)>=48 && s.charAt(i)<=57)){
					ans+=s.charAt(i);
			}
		}
		System.out.println(ans);
	}
}