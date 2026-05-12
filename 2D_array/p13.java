class demo{
	public static void main(String [] args){
		int arr[][] = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};

for(int k = 0; k <= 4; k++) {

    for(int i = 0; i < arr.length; i++) {

        for(int j = 0; j < arr[0].length; j++) {

            if(i + j == k) {
                System.out.print(arr[i][j] + " ");
            }
        }
    }
}				
	}
}