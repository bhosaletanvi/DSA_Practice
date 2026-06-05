import java.util.*;
class demo{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		System.out.println("Enter String : ");
		sb.append(sc.nextLine());
		System.out.println("Enter Character : ");
		char target= sc.next().charAt(0);
		
		int count=0;	

		for(int i=0;i<sb.length();i++){
			if(sb.charAt(i)==target){
				count++;
			}
		}
	
		System.out.println(count);
	}
}