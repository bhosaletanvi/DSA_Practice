import java.util.*;
class demo{
        public static void main(String [] args){
		HashMap <Integer,Integer> hm = new HashMap<>();
		int [] arr ={10,5,2,7,1,9};
		int k=15,sum=0,max=0;
		for(int i=0;i<arr.length;i++){
			sum+=arr[i];
			if(sum==k){
				max=i+1;
			}
			if(hm.containsKey(sum-k)){
				int length=i-hm.get(sum-k);
				max=Math.max(max,length);
			}else{
				hm.put(sum,i);
			}
		}
		System.out.print(max);
	}	
}