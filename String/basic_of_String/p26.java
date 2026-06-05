import java.util.*;
class demo{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String s= sc.nextLine();
		String toggle=" ";
		for(int i=0;i<s.length();i++){
           		char ch = s.charAt(i);
			if(s.charAt(i)>='A' && s.charAt(i)<='Z'){
				toggle+=(char)(ch-32);
			}else{
				toggle+=(char)(ch+32);
			}


		}
		System.out.println(toggle);
	}
}