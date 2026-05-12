class demo{
	public static void main(String [] args){
				int arr[][] = {
    {1, 2, 3, 4},
    {5, 1, 2, 3},
    {6, 5, 1, 2}
};

boolean flag = true;

for(int i = 0; i < arr.length - 1; i++) {
    for(int j = 0; j < arr[0].length - 1; j++) {

        if(arr[i][j] != arr[i + 1][j + 1]) {
            flag = false;
            break;
        }
    }

    if(flag == false) {
        break;
    }
}

if(flag == true) {
    System.out.println("Toeplitz matrix");
}
else {
    System.out.println("Not a Toeplitz matrix");
}		
	}
}