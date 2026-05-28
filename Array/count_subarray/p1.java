class demo{
	public static void main(String [] args){
		int [] arr={1,1,1};
		int k=2,sum=0,count=0,j=0;
		for(int i=0;i<arr.length;i=j){
			sum=0;
			for(j=i;j<arr.length;j++){
				sum+=arr[j];
				if(sum==k){
					count++;
					i=j;
					break;
				}else if(sum>k){
					break;
				}
			}
		}
		System.out.print(count);
	}
}