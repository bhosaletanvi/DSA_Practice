import java.util.*;
class demo{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String 1 : ");
		String s1 = sc.next();
		System.out.println("Enter String 2 : ");
		String s2 = sc.next();
		int index=0;
		
		for(int i=0;i<s2.length();i++){
			if(s1.charAt(index)==s2.charAt(i)){
				index++;
			}
		}
		
		if(index==s1.length()){
			System.out.print("true");
		}else{
			System.out.print("false");
		}

		
	}
}