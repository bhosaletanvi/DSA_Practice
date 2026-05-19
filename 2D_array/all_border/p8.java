class demo{
	public static void main(String [] args){
		int arr[][] = {
   				 {1, 2, 3, 4},
  				 {5, 6, 7, 8},
   				 {9, 10, 11, 12},
 			 	 {13, 14, 15, 16},
  			 	 {17, 18, 19, 20},
	
			};
			for(int i=0;i<arr[0].length;i++){
				System.out.print(arr[0][i]+" ");
			}
			
			for(int j=1;j<arr.length;j++){
				System.out.print(arr[j][arr[0].length-1]+" ");
			}
		for(int k=arr[0].length-2;k>=0;k--){
			System.out.print(arr[arr.length-1][k]+" ");
		}
		for(int l=arr.length-2;l>=0;l--){
				System.out.print(arr[l][0]+" ");
			}
	}
}