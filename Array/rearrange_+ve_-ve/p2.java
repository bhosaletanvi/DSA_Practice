import java.util.*;
class demo{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Array Size : ");
		int size = sc.nextInt();
		int [] arr = new int[size];
		System.out.print("Enter array element : ");
		for(int i = 0; i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		int[] temp= new int[size];
		int pos=0,neg=0,index=0;
		for(int i=0;i<arr.length;i++){
			if(arr[j]<0){
				temp[neg]=arr[i];
				neg+=2
			}
			else{
				temp[pos]=arr[i];
				pos+=2				
					}
				}
			}

		}
		for(int i = 0; i<temp.length;i++){
			System.out.print(" "+temp[i]);
		}
	
	}
}