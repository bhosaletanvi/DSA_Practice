import java.util.*;
class demo{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String s= sc.nextLine();
		System.out.print(most_freqent(s));
	}
	static char most_freqent(String s){
		HashMap <Character , Integer> hm = new HashMap<>();
		for(int i=0;i<s.length();i++){
			hm.put(s.charAt(i),hm.getOrDefault(s.charAt(i),0)+1);
		}
		int max=0;
		char ans ='A';	
		for(Character ch : hm.keySet()){
			if(max<hm.get(ch)){
				max=hm.get(ch);	
				ans=ch;
			}
		}
		return ans;
	}
}