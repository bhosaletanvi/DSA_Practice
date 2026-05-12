class demo{
	public static void main(String [] args){
		int arr[][] = {
   				 {1, 2, 3, 4},
  				 {5, 6, 7, 8},
   				 {9, 10, 11, 12},
 			 	 {13, 14, 15, 16},
  			 	 {17, 18, 19, 20},
	
			};
		for(int i=0;i<arr[0].length-1;i+=2){
			for(int j=0;j<arr.length;j++){
				System.out.print(arr[j][i]+" ");
			}
			
			for(int k=arr.length-1;k>=0;k--){
				System.out.print(arr[k][i+1]+" ");
			}
		}

	}
}