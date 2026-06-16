import java.util.*;
class demo{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String s= sc.next();
		char[] ch = s.toCharArray();
		int last=ch.length-1;
		for(int i=0;i<ch.length;i++){
			if(Character.isLetterOrDigit(ch[i])){
				while(i<last){
					if(Character.isLetterOrDigit(ch[last])){
						char temp = ch[i];
						ch[i]=ch[last];
						ch[last]=temp;
						last--;
						break;
					}
					last--;
				}
			}
		}
	
		System.out.println(new String(ch));

		
	}
}