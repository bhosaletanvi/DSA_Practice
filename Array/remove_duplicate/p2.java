import java.util.*;
class demo {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Array Size : ");
        int size =sc.nextInt();
	int [] arr=new int [size];
	System.out.print("Enter Array Elements : ");
	for(int i =0; i<arr.length;i++){
		arr[i]=sc.nextInt();
	}
	int [] ans = new int [arr.length];
	HashMap<Integer,Integer> hm = new HashMap<>();
	for(int i =0 ;i<arr.length;i++){
		hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
	}
	int index=0;
	for(int i =0;i<arr.length;i++){
		if(hm.get(arr[i])!=0){
			ans[index]=arr[i];
			hm.put(arr[i],0);
			index++;
		}
	}
	
	for(int i =0;i<ans.length;i++){
		System.out.print(" "+ans[i]);
	}

	
}
}