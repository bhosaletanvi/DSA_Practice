import java.util.*;
class demo{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String s= sc.nextLine();
		int alphabet=0,digit=0,special_char=0;
		for(int i=0;i<s.length();i++){
			if((s.charAt(i)>=65 && s.charAt(i)<=90) || (s.charAt(i)>=97 && 				s.charAt(i)<=122)){
				alphabet++;
			}else if((s.charAt(i)>=48 && s.charAt(i)<=57)){
				digit++;
			}else if(!(s.charAt(i)==32)){
				special_char++;
			}
		}
		System.out.println("alphabet : "+alphabet+"\ndigits : "+digit+"\nspecial character : "+special_char);
	}
}