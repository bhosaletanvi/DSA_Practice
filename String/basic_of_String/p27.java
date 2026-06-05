import java.util.*;
class demo{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		System.out.println("Enter String : ");
		sb.append(sc.nextLine());
		for(int i=0;i<sb.length();i++){
           	     if(sb.charAt(i)==32){
				sb.deleteCharAt(i);
			}	
		}
		System.out.println(sb);
	}
}