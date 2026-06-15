import java.util.*;
class demo{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String s = sc.nextLine();
		int last=s.length()-1;	
		boolean flag=true;
		for(int i=0;i<last;i++){
			if(Character.isLetterOrDigit(s.charAt(i))){
				while(i<last){

					if(Character.isLetterOrDigit(s.charAt(last))){
						if(Character.toLowerCase(s.charAt(i))!=Character.toLowerCase(s.charAt(last))){
								flag=false;
								break;				
						}
					}else{
						last--;
						continue;
					}
					last--;
					break;
				}
			}
			if(!flag){
				break;
			}
		}
		System.out.print(flag);
	}
}