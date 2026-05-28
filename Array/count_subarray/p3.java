import java.util.*;
class demo{
	public static void main(String [] args){
		int [] arr={3,4,7,2,-3,1,4,2};
		int k=7,sum=0,count=0;
		HashMap <Integer,Integer> hm = new HashMap<>();
		hm.put(0,1);
		for(int i=0;i<arr.length;i++){
			sum+=arr[i];
			if(hm.containsKey(sum-k)){
				count+=hm.get(sum-k);
			}
			hm.put(sum,hm.getOrDefault(sum,0)+1);
		}
		System.out.print(count);
	}
}