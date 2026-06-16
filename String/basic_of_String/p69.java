import java.util.*;
class demo{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String str= sc.nextLine();
		String[] s = str.split(" ");
		int min=Integer.MAX_VALUE;
		int minindex=0;
		for(int i=0;i<s.length;i++){
			min=Math.min(min,s[i].length());
			if(min==s[i].length()){
				minindex=i;
			} 
		}
		for(int i=0;i<s[minindex].length();i++){
			int index=0,count=0;
			while(index<s.length){
				if(s[minindex].charAt(i)==s[index].charAt(i)){
					count++;
				}
				index++;
			}
			if(count==s.length){
				System.out.print(s[minindex].charAt(i));
			}else{
				break;
			}
		}
				
	}
}