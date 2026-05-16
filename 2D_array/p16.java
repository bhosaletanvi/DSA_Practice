//1 5 9 13 17 18 19 20 16 12 8 4 3 2

class demo{
	public static void main(String [] args){
		int arr[][] = {
   				 {1, 2, 3, 4},
  				 {5, 6, 7, 8},
   				 {9, 10, 11, 12},
 			 	 {13, 14, 15, 16},
  			 	 {17, 18, 19, 20},
	
			};
		

		for(int j=0;j<arr.length;j++ ){
			System.out.print(arr[j][0]+" ");
		}

		for(int k=1;k<arr[0].length ;k++){
			System.out.print(arr[4][k]+" ");
		}
		
		for(int l=arr.length-2;l>=0;l-- ){
			System.out.print(arr[l][arr[0].length-1]+" ");
		}

		for(int i=arr[0].length-2;i>=1;i--){
			System.out.print(arr[0][i]+" ");
		}		
	}
}