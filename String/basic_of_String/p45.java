import java.util.*;
class demo{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		HashMap<Character , Integer> hm = new HashMap<>();
		System.out.println("Enter String : ");
		String ans = "";
		String s= sc.nextLine();
		for(int i=0;i<s.length();i++){
			hm.put(s.charAt(i),hm.getOrDefault(s.charAt(i),0)+1);		
		}
		for(Character ch : hm.keySet()){
			ans+=ch;
		}
		System.out.print(ans);
		
	}
}