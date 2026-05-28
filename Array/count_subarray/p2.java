class demo{
	public static void main(String [] args){
		int [] arr={1,1,1};
		int k=2,sum=0,count=0,end=0;
		for(int i=0;i<arr.length;i=end+1){
			sum+=arr[i];
			if(sum<=k){
				if(sum==k){
					count++;
				}
				end=i;
			}else{
				end=i-1;
				sum=0;
			}
		}		
		System.out.print(count);
	}
}