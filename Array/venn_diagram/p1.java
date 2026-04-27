import java.util.*;
class demo{
	public static void main(String [] args){
		int [] arr1={1,2,3,4,5};
		int [] arr2={2,3,4,4,5};
		HashMap<Integer,Integer> hm =new HashMap<>();
		for(int i=0;i<arr1.length;i++){
			hm.put(arr1[i],hm.getOrDefault(arr1[i],0)+1);
		}
		
		for(int i=0;i<arr2.length;i++){
			hm.put(arr2[i],hm.getOrDefault(arr2[i],0)+1);
		}
		
		for(Integer key : hm.keySet()){
			System.out.print(key);		
		}	
	}
}