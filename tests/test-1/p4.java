class demo{
	public static void main(String [] args){
		int [] arr={16,17,4,3,5,2};
		boolean flag=true;
		for(int i=0;i<arr.length-1;i++){
			flag=true;
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]<arr[j]){
					flag=false;
					break;
				}
			}
			if(flag){
				System.out.print(arr[i]+" ");
			}
		}
		System.out.print(arr[arr.length-1]+" ");

	}
}