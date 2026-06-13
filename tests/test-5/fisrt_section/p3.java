import java.util.*;
class demo{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		HashMap <Integer , Integer> hm = new HashMap<>();
		System.out.println("Enter size : ");
		int size= sc.nextInt();
		boolean flag =false;
		int [] nums= new int[size];
		System.out.println("Enter Elements ");
		for(int i=0;i<nums.length;i++){
			nums[i]=sc.nextInt();
		}
		for(int i=0;i<nums.length;i++){
			hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
		}
		for(Integer key : hm.keySet()){
			if(hm.get(key)>1){
				flag=true;
				break;
			}
		}
		System.out.print(flag);
	}
}