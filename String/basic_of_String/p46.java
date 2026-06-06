import java.util.*;
class demo{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		System.out.println("Enter String : ");
		sb.append(sc.nextLine());
		String ans="";
		int count=0;
		for(int i=0;i<sb.length();i++){
			for(int j=i;j<sb.length();j++){
				if(sb.charAt(i)==sb.charAt(j)){
					count++;
					sb.deleteCharAt(i);
				}
					
			}
			ans+=sb.charAt(i);
			ans+=count;
			count=0;
		
		}
		System.out.print(ans);	
		
	}
}