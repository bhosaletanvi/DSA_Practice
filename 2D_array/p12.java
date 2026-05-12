class demo{
	public static void main(String [] args){
				int arr[][] = {
    {1, 2, 3},
    {4, 5, 6}
};

int temp[][] = new int[3][2];

for(int i = 0; i < arr.length; i++) {
    for(int j = 0; j < arr[0].length; j++) {

        temp[j][i] = arr[i][j];
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