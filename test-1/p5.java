class demo{
	public static void main(String [] args){
		int [] arr={0,1,0,3,12,0,5,0};
		int index=0,zero=0,temp=0;	
		for(int i=0;i<arr.length;i++){
			while(index<arr.length){
				if(arr[index]==0){
					zero=index;
					break;
				}
			}
			if(arr[i]!=0){
				arr[zero]=arr[i];
				arr[i]=0;
				index++;
			}			
		}
		for(int j=0;j<arr.length;j++){
		System.out.print(arr[j]+" ");

		}
	}
}