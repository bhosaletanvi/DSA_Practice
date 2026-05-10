import java.util.*;
class demo{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array Size : ");
		int size = sc.nextInt();
		int [] arr = new int[size];
		System.out.print("Enter array element : ");
		for(int i = 0; i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		int[] temp= new int[size];
		int pos=0,neg=0;
		for(int i=0;i<temp.length;i++){
			if(i%2==0){
				for(int j=pos;j<temp.length;j++){
					if(arr[j]>0){
						temp[i]=arr[j];
						pos++;
						break;
					}
				}
			}
			else{
				for(int j=neg;j<temp.length;j++){
					if(arr[j]<0){
						temp[i]=arr[j];
						neg++;
						break;
					}
				}
			}

		}
		for(int i = 0; i<temp.length;i++){
			System.out.print(" "+temp[i]);
		}
	
	}
}