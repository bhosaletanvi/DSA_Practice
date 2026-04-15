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
	static void fun(int [] arr,int low ,int high){
		if(low>=high){return ;}
		int pivot=pivotFinder(arr, low , high);
		fun(arr,low,pivot-1);
		fun(arr,pivot+1,high);

	} 

	static int pivotFinder(int [] arr,int low,int high){
		int pivot=arr[low];
		int i= low ;
		int j=high;
		while(i<j){
			while(i<=high-1 && arr[i]<=pivot){
				i++;
			}
			while(j>=low+1 && arr[j]>pivot){
				j--;
			}
			if(i<j){
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		
		}
			int temp=arr[low];
			arr[low]=arr[j];
			arr[j]=temp;
			return j;
	}

}