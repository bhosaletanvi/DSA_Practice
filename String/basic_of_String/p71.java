import java.util.*;
class demo{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String s= sc.nextLine();
		char[] ch = s.toCharArray();
		int last=ch.length-1;
		boolean flag=true;
		for(int i=0;i<=last;i++){
				while(i<=last){
						if(ch[i]!='@'){
							if(ch[i]!=ch[last]){
									flag=false;
							}
							if((last<ch.length && i>0 ) && (ch[i-1]==ch[last+1])){
								System.out.println(ch[i-1]+"   "+ch[last+1]);
								ch[i]='@';
								flag=true;
							}
						}
					last--;
					break;
				}
		}
	
		System.out.println(flag);

						
	}
}