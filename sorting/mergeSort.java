class demo{
	public static void main(String[]args){
		int [] arr={7,3,5,2,6,1};
		int low=0,high=arr.length-1;
		for(int i =0;i<arr.length;i++){
			System.out.print(" "+arr[i]);
		}
		System.out.println();
		fun(arr,low,high);
		for(int i =0;i<arr.length;i++){
			System.out.print(" "+arr[i]);
		}

	}
	static void fun(int [] arr,int low,int high){
	if(low>=high){
		return;
	}
	int mid=(low+high)/2;
	fun(arr,low,mid);
	fun(arr,mid+1,high);
	merge(arr,low,mid,high);
	}
	
	static void merge(int [] arr,int low ,int mid ,int high){
		int [] merged = new int[high-low+1];
		int blue =low ,green=mid+1,red=0;
		while(blue<=mid && green <= high){
			if(arr[blue]<=arr[green]){
				merged[red]=arr[blue];
				red++;blue++;
			}
			else{
				merged[red]=arr[green];
				red++;green++;

			}
		}
		while(blue<=mid){
			merged[red]=arr[blue];
			red++;blue++;

		}
		while(green<=high){
			merged[red]=arr[green];
			red++;green++;

		}
		for(int i =0;i<merged.length;i++){
			arr[low+i]=merged[i];
		}

	}
}	