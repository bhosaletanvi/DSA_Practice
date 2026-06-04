import java.util.*;
class demo{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		System.out.println("Enter String : ");
		sb.append(sc.nextLine());
		sb.reverse();
		
		System.out.println(sb);
	}
}