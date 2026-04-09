import java.util.Scanner;
class demo{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter array Size : ");
		int size = sc.nextInt();
		int[] arr=new int[size];
		System.out.println(" Enter Elements : ");
		for(int i =0;i<arr.length;i++){
			arr[i]=sc.nextInt();
			}
		for(int i=1;i<arr.length;i++){
			int current_element=arr[i];
			int left=i-1;
			while(left>=0 && arr[left]>=current_element){
				arr[left+1]=arr[left];
				left--;
			}
			arr[left+1]=current_element;
	       }
		
		for(int i =0;i<arr.length;i++){
			System.out.print(" "+arr[i]);
			}

	}
}			