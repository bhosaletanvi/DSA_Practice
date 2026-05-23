class demo{
	public static void main(String [] args){
		int [] arr={0,1,0,3,12,0,5,0};
		int index=0,zero=0,temp=0;	
		for(int i=0;i<arr.length;i++){
			if(arr[i]==0){
		
				zero=i;
				
			}
		}
		for(int j=zero+1;j<zrr.length;j++){	
			if(arr[j]!=0){
				temp=arr[i];
				arr[i]=0;
				arr[zero]=temp;
			}
		}
		for(int i=0;i<arr.length;i++){
		System.out.print(arr[i]+" ");

		}
	}
}