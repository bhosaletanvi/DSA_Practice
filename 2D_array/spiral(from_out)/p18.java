//1 5 9 13 14 15 16 12 8 4 3 2 6 10 11 7
//  ______ 	
//| |    |	
//| |__| |	
//|______|

class demo{
	public static void main(String [] args){
		int arr[][] = {
   				 {1, 2, 3, 4},
  				 {5, 6, 7, 8},
   				 {9, 10, 11, 12},
 			 	 {13, 14, 15, 16},	
			};
		int fr=0,lr=arr.length-1,fc=0,lc=arr[0].length-1,total=arr.length*arr[0].length,dir=-1;
		while(total!=0){
			dir=(dir+1)%4;
			if(dir==0){
				for(int i=fr;i<=lr;i++){
					System.out.print(arr[i][fc]+" ");
					total--;
				}
				fc=fc+1;
			}
			else if(dir==1){
				for(int j=fc;j<=lc;j++){
					System.out.print(arr[lr][j]+" ");
					total--;
				}
				lr=lr-1;
			}
			else if(dir==2){
				for(int k=lr;k>=fr;k--){
					System.out.print(arr[k][lc]+" ");
					total--;
				}
				lc=lc-1;
			}
			else{
				for(int l=lc;l>=fc;l--){
					System.out.print(arr[fr][l]+" ");
					total--;
				}
				fr=fr+1;
			}
		}
	
	}
}