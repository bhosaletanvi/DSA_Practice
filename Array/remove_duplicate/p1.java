// Remove Duplicate from array
//arr={1,2,3,4,3,4}
// arr={1,2,3,4,-1,-1}

import java.util.Scanner;
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
	int [] arr2=new int [arr.length];
	for(int i =0;i<arr.length;i++){
		int count =0;
		for(int k =0;k<arr.length;k++){
			if(arr[i]==arr[k]){
				count++;
			}	
		}
		
		for(int j =0;j<arr2.length;j++){
			int count2=0;
			if(count==1){
				arr2[j]=arr[i];
				j++; 
				break;

			}
			if(count>1){
				for(int k =0;k<arr.length;k++){
					count2=0;
					if(arr[i]==arr[k]){
					count2++;
				}	
			}
				if(count2<1){
					arr2[j]=arr[i];
					j++; 
					break;
				}
				break;

			}
		}

	}
	for(int j =0;j<arr.length;j++){
		System.out.print(" "+arr[j]);
				}	

}

}