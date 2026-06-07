import java.util.*;
class demo{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String s= sc.nextLine();
	
		System.out.print(removeDuplicate(s));		
	}
	static StringBuilder removeDuplicate(String s){
		StringBuilder sb = new StringBuilder(s);
		for(int i=0;i<sb.length();i++){
			for(int j=i+1;j<sb.length();j++){
				if(sb.charAt(i)==sb.charAt(j)){
					sb.deleteCharAt(i);
				}
			}
		}
		return sb;		
	}
}