import java.util.*;
class demo{
	public static void main(String [] args){
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter Size : ");
		int size=sc.nextInt();
		int [] arr=new int[size];
		System.out.print("Enter elements : ");
		for(int i=0;i<arr.length;i++){
			arr[i] = sc.nextInt();
		}
		System.out.print("Enter K : ");
		int k=sc.nextInt();

		HashMap <Integer , Integer> hm = new HashMap<>();
		hm.put(0,1);
		int sum=0,start=0,end=0;
		for(int i=0;i<arr.length;i++){
			sum+=arr[i];
			if(sum%k==1){
				start=i;
			}
			if(hm.containsKey(sum-k)){
				end=i;
			}

			if(hm.containsKey(sum-k)){
				for(int index=start;index<=end;index++){
					System.out.print(arr[index]+" ");
				}
			}
			
			System.out.println();
			hm.put(sum,i);
		} 
	}
}