import java.util.*;
class demo{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String s= sc.nextLine();
		String rev="";
		for(int i=s.length()-1;i>=0;i--){
			rev+=s.charAt(i);
		}
		System.out.println(rev);

		if(rev==s){
		System.out.println("pelindrome String ");
		}
		else{
		System.out.println("not pelindrome String ");
		}

	}
}