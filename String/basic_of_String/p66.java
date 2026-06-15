import java.util.*;
class demo{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size : ");
		int Size = sc.nextInt();
		String [] s= new String[Size];
		for(int i=0;i<s.length;i++){
			s[i]=sc.next();
		}
		for(int i=0;i<s.length;i++){
			System.out.print(s[i]+" ");
		}

		int last=s.length-1;
		for(int i=0;i<last;i++){
			String temp = s[i];
			s[i]=s[last];
			s[last]=temp;
			last--;
		}
		System.out.println();
		for(int i=0;i<s.length;i++){
			System.out.print(s[i]+" ");
		}

	}
}