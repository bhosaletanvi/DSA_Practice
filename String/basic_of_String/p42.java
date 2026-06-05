import java.util.*;
class demo{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String s= sc.nextLine();
		String ans= "";
		
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)==' '){
				ans+='-';
			}else{
				ans+=s.charAt(i);
			}
		}
		System.out.println(ans);
	}
}