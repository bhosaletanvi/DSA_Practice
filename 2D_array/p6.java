class demo{
	public static void main(String [] args){
		int [][] arr={
				{1,2,3,4,5},
				{2,3,4,5,6},
				{3,4,5,6,7},
				{4,5,6,7,8},
				{5,6,7,8,9}
			};
		int digo1=0,digo2=0;		
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[0].length;j++){
				if(i==j){
					digo1+=arr[i][j];				
				}
				if(i+j==arr.length-1){
					digo2+=arr[i][j];				
				}

			}
		}
		System.out.print(digo1+" : 1st digonal \n "+digo2+" : 2nd digonal");
		


	}
}