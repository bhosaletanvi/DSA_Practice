import java.util.*;
class demo{
	public static void main(String [] args){
		int start=0,count=1,max=0,i=0;
		int [] arr={100,4,200,1,2,3,5,6};
		Arrays.sort(arr);
		while(i<arr.length){
			count=0;
			for( ;i<arr.length-1;i++){
				if(arr[i]+1==arr[i+1]){
					count++;
				}else{
					i=i+1;
					break;
				}
			}
			max=Math.max(max,count);
		}
		System.out.print(max);
		
	}
}