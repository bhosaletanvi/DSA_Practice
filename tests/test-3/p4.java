class demo{
	public static void main(String [] args){
		int [] arr ={1,2,-3,-1,-2,3};
		for(int t=0;t<arr.length;t++){
			System.out.print(arr[t]+" ");
		}
		int zero=0,pos=0;
		if(arr[0]>0){
			zero=1;
			pos=1;
		}
		while(zero<arr.length && pos<arr.length){
			while(zero<arr.length){
				if(arr[zero]<0){
					break;
				}
				zero++;
			}
			while(pos<arr.length){
				if(arr[pos]>0){
					break;
				}
				pos++;
			}
			int temp = arr[zero];
			arr[zero] = arr[pos];
			arr[pos] = temp;
			pos=zero+1;
			if(arr[zero+1]<0){
				zero+=2;
			}
		}
		System.out.println();
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}


	}
}