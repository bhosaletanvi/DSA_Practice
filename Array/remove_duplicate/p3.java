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
	int index=0;
	HashSet<Integer> hs = new HashSet<>();
	for(int i =0 ;i<arr.length;i++){
		if(!hs.contains(arr[i])){
			hs.add(arr[i]);
			arr[index]=arr[i];
			index++;
		}		
	}
		
	for(int i =0;i<arr.length;i++){
		System.out.print(" "+arr[i]);
	}

	
}
}