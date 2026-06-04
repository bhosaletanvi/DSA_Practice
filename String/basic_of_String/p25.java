import java.util.*;
class demo{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String s= sc.nextLine();
		boolean flag=true;
		int i=0,length=s.length(),mid=0;
		System.out.println(length);
		if(length%2==0){
			i=(length/2)-1;
			mid=s.length()/2;
		}else{
			i=(length/2)-1;
			mid=(length/2)+1;

		}
		for( ;i>=0;i--){
			if((s.charAt(i)!=s.charAt(mid))){
				flag=false;
			}
			mid++;
		}
		System.out.println(flag);

		
	}
}