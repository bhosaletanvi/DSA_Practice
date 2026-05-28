class demo{
	public static void main(String [] ars){
		int [] arr={7,10,4,2,8,1,0};
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
				System.out.print(" "+arr[i]);
			}
		}
		System.out.print(" "+arr[arr.length-1]);

	}
}