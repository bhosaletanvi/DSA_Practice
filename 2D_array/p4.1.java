class demo{
	public static void main(String [] args){
		int [][] arr={
				{1,2,3,4,5},
				{2,3,4,5,6},
				{3,4,5,6,7},
				{4,5,6,7,8},
				{5,6,7,8,9}
			};
		int max=0;		
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[0].length;j++){
				max=Math.max(max,arr[i][j]);
			}
		}
		System.out.print(max+" is max no .");

	}
}