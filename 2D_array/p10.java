class demo{
	public static void main(String [] args){
		int arr[][] = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};
		int temp[][] = new int[arr.length][arr[0].length];

		 for(int i = arr.length - 1; i >= 0; i--) {
    			for(int j = 0; j < arr.length; j++) {
       			 temp[j][arr.length - 1 - i] = arr[i][j];
   			 }
		}

		for(int i = 0; i < temp.length; i++) {
    for(int j = 0; j < temp[0].length; j++) {
        System.out.print(temp[i][j] + " ");
    }
    System.out.println();
}		
	}
}