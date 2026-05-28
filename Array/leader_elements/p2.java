import java.util.*;
class demo{
	public static void main(String [] ars){
		int [] arr={7,10,4,2,8,1,0};
		int max=-1;
		ArrayList<Integer> al = new ArrayList<>();
		for(int i=arr.length-1;i>=0;i--){
			if(arr[i]>max){
				max=arr[i];
				al.add(max);
			}
		}
		for(int i=al.size()-1;i>=0;i--){
			System.out.print(al.get(i)+" ");
		}

	}
}