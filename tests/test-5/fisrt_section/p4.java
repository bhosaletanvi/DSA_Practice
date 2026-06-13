import java.util.*;
class demo{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size : ");
		int size= sc.nextInt();
		int [] arr= new int[size];
		System.out.println("Enter Elements ");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		int max=0,count=0;
		for(int i=0;i<arr.length;i++){
			for(int j=arr.length-1;j>=0;j--){
				count=1;
				for(int k=i;k<j;k++){
					if(arr[k]==1 && arr[k+1]==1){
						count++;
					}else{
						break;
					}
				}
				max=Math.max(max,count);	
			}			
		}
		System.out.print(max);
	}
}