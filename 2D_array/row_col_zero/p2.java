class demo{
	public static void main(String [] args){
		int [][]arr={
				{1,0,1},
				{2,3,4},
				{0,8,5},
				
			};
		int [] rows=new int[arr.length];
		int [] cols=new int[arr[0].length];

		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[0].length;j++){
				if(arr[i][j]==0){
					rows[i]=-1;
					cols[j]=-1;
				}
			}
		}
		System.out.print("Before : \n");
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[0].length;j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}

		for(int i=0;i<arr.length;i++){
			if(rows[i]==-1){
				for(int k=0;k<arr.length;k++){
					arr[i][k]=0;
				}
			}
		}

		for(int i=0;i<arr[0].length;i++){
			if(cols[i]==-1){
				for(int k=0;k<arr.length;k++){
					arr[k][i]=0;
				}
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