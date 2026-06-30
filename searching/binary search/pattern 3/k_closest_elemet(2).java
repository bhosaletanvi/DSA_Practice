import java.util.*;
class demo{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size : ");
		int size = sc.nextInt();
		int [] arr= new int[size];
		System.out.println("Enter elements : ");	
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter k : ");
		int k = sc.nextInt();
		System.out.println("Enter element : ");
		int el = sc.nextInt();
		System.out.println(closest(arr,k,el));
	}
	 static ArrayList<Integer> closest(int[] arr,int k , int el) {
        	int low=0,high=arr.length-1;
		while((high-low+1)>k){
			if(arr[low]-el > arr[high]-el){
				low++;
			}else{
				high--;
			}
		}
		ArrayList<Integer> al = new ArrayList<>();
		for(int i=low;i<=high;i++){
			al.add(arr[i]);
		}
		return al;
    }
}