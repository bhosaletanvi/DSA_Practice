class demo{
	public static void main(String [] args){
		boolean flag=false;
		int [] arr={64,34,25,12,22,11};
		System.out.print("Before Sorting : ");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}

		for(int i=arr.length-1;i>0;i--){
			flag=false;
			for(int j=0;j<i;j++){
				if(arr[j]>arr[j+1]){
					flag=true;
					int temp =arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
			
			if(!flag){
				break;
			}
		}
		System.out.print("\nAfter Sorting : ");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}

	}
}