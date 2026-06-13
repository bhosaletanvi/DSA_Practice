
import java.util.*;
class demo{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int count=1,max=0;
		System.out.println("Enter String : ");
		String s= sc.next();
		for(int i=0;i<s.length()-1;i++){
			if(s.charAt(i+1)==(char)(s.charAt(i)+1)){
				count++;
			}else{
				count=1;
			}
			max=Math.max(max,count);
		}
		System.out.print(max);
	}
}