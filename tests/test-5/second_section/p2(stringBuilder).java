import java.util.*;
class demo{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String s= sc.next();
		int max=0,count=0;
		StringBuilder sb = new StringBuilder();
		sb.append(s.charAt(0));
		for(int i=1;i<s.length();i++){
			for(int j=0;j<sb.length();j++){
				if(sb.charAt(j)==s.charAt(i)){
					count=sb.length();
					sb.delete(0,j+1);
					break;
				}
			}
			sb.append(s.charAt(i));
			max=Math.max(max,count);

		}
		max=Math.max(max,sb.length());
		System.out.println(max);		
	}
}