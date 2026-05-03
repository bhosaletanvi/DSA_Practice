import java.util.*;
class demo{
	public static void main(String [] args){
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter array size : ");
		int size = sc.nextInt();
		int [] arr= new int[size];
		System.out.print("Enter array elements : ");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		System.out.print("Enter target : ");
		int target = sc.nextInt();
		HashMap <Integer,Integer> hm = new HashMap<>();
		for(int i=0;i<arr.length;i++){
			int grj=target-arr[i];
			if(hm.containsKey(grj)){
				return new int[] {hm.get(grj),i};
			}
			hm.put(arr[i],i);
		}
	}
}