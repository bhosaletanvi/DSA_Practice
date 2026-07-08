import java.util.*;
class demo{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size : ");
		int size = sc.nextInt();
		int [] arr= new int[size];
		System.out.println("Enter Piles : ");	
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter hr : ");
		int h = sc.nextInt();
		System.out.println(koko_eating_banana(arr,h));
	}
	static int koko_eating_banana(int[] arr, int h) {
        int capacity =1,maxhr=Integer.MAX_VALUE,hr=Integer.MAX_VALUE,ans=0;
        while(maxhr>h){
	    hr=0;
            for(int i=0;i<arr.length;i++){
                int pile=arr[i];
                while(pile>0){
                    pile-=capacity;
                    hr++;
                }
            }
	    System.out.println(hr);	
            if(hr<maxhr){
                maxhr=hr;
                ans=capacity;
            }
	capacity++;	
        }
        return ans;
    }	
}