class demo{
	public static void main(String [] args){
		int [][]arr={
				{1,0,1},
				{2,3,4},
				{0,8,5},
				
			};
		int [][]temp= new int[arr.length][arr[0].length];
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[0].length;j++){
				temp[i][j]=arr[i][j];
			}
		}
		System.out.print("Before : \n");
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[0].length;j++){
				System.out.print(temp[i][j]+" ");
			}
			System.out.println();
		}
//-------------------------------------------------------------------------------------------
		
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[0].length;j++){
				if(arr[i][j]==0){
					for(int k=0;k<arr[0].length;k++){
						temp[i][k]=0;
					}

					for(int k=0;k<arr.length;k++){
						temp[k][j]=0;
					}
				}
			}
		}

		System.out.print("After : \n");
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length;j++){
				System.out.print(temp[i][j]+" ");
			}
			System.out.println();
		}


	}
}