import java.util.*;
class demo{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String s= sc.nextLine();
		System.out.print(least_freqent(s));
	}
	static char least_freqent(String s){
		HashMap <Character , Integer> hm = new HashMap<>();
		for(int i=0;i<s.length();i++){
			hm.put(s.charAt(i),hm.getOrDefault(s.charAt(i),0)+1);
		}
		int min=s.length()-1;
		char ans ='A';	
		for(Character ch : hm.keySet()){
			if(min>hm.get(ch)){
				min=hm.get(ch);	
				ans=ch;
			}
		}
		return ans;
	}
}