import java.util.*;
class demo{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String s1= sc.nextLine();

		System.out.println("Enter rotated String : ");
		String s2= sc.nextLine();
		System.out.print(RotatedOrNot(s1,s2));				
	}
	static boolean RotatedOrNot(String s1 , String s2){
		StringBuilder sb1 = new StringBuilder();
		StringBuilder sb2 = new StringBuilder();
		if(sb1.length()!=sb2.length()){
			return false;
		}
		for(int i=0;i<sb1.length();i++){
			if(sb1.charAt(i)==sb2.charAt(i)){
				sb1.deleteCharAt(i);
				sb2.deleteCharAt(i);
			}
		}
		int i=0;
		for( i=0;i<sb2.length();i++){
			if(sb2.charAt(i)==sb1.charAt(0)){
				break;
			}
		}
		int index=1;
		for(int j=i+1;j<sb2.length();j++){
			if(sb1.charAt(index)!=sb2.charAt(j)){
				return false;
			}
			index++;
		}
		for(int k=0;k<i;k++){
			if(sb1.charAt(index)!=sb2.charAt(k)){
				return false;
			}
			index++;
		}
		return true;
	}

}