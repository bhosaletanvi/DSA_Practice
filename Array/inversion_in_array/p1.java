class demo{
	static int count=0;
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
		System.out.print(count);

	}
	static void fun(int [] arr,int low,int high){
	if(low>=high){
		return;
	}
	int mid=low+(high-low)/2;
	fun(arr,low,mid);
	fun(arr,mid+1,high);
	merge(arr,low,mid,high);
	}
	static void merge(int [] arr,int low ,int mid ,int high){
		int blue =low ,green=mid+1;
		while(blue<=mid && green <= high){
			if(arr[blue]>arr[green]){
				count++;
				if(green==high){
					blue++;
					green=mid+1;
				}else{
					green++;
				}
			}else{
				green++;
				if(green>=high){
					blue++;
					green=mid+1;
				}
			}	
		}
	}
}	