import java.util.*;
class demo{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int count=1,max=0;
		HashMap <Integer , Integer> hm = new HashMap<>();
		System.out.println("Enter size : ");
		int size = sc.nextInt();
		int [] arr= new int[size];
		System.out.println("Enter elements : ");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}

		for(int i=0;i<arr.length;i++){
			hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
		}
		int index=0,num=arr[index];
		while(index!=arr.length-1){
			if(hm.containsKey(num+1)){
				count++;
				num+=1;
			}else{
				count=1;
				index++;
				num=arr[index];
			}
			max=Math.max(max,count);
		}		
		System.out.print(max);
	}
}