class demo{
	public static void main(String [] args){
		int [][]arr={
				{1,1,1},
				{2,3,4},
				{2,8,5},
				
			};
		boolean colszero=false,rowszero=false;

		System.out.print("Before : \n");
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[0].length;j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}

				
		for(int i=0;i<arr[0].length;i++){
			if(arr[0][i]==0){
				colszero=true;
			}
		}

		for(int i=0;i<arr.length;i++){
			if(arr[i][0]==0){
				rowszero=true;
			}
		}

		for(int i=1;i<arr.length;i++){
			for(int j=1;j<arr.length;j++){
				if(arr[i][j]==0){
					arr[i][0]=0;
					arr[0][j]=0;
				}
			}
		}

		for(int i=0;i<arr.length;i++){
			if(arr[i][0]==0){
			for(int j=0;j<arr[0].length;j++){
				arr[i][j]=0;
				}
			}
		}

		for(int i=0;i<arr[0].length;i++){
			if(arr[0][i]==0){
			for(int j=0;j<arr.length;j++){
				arr[j][i]=0;
				}
			}
		}

		if(rowszero){
			for(int j=0;j<arr.length;j++){
				arr[j][0]=0;
			}
		}

		if(colszero){
			for(int j=0;j<arr[0].length;j++){
				arr[0][j]=0;
			}
		}

		
		System.out.print("After : \n");
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length;j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}



	}
}