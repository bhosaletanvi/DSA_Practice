//1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10


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
				for(int i=fc;i<=lc;i++){
					System.out.print(arr[fr][i]+" ");
					total--;
				}
				fr=fr+1;
			}
			else if(dir==1){
				for(int j=fr;j<=lr;j++){
					System.out.print(arr[j][lc]+" ");
					total--;
				}
				lc=lc-1;
			}
			else if(dir==2){
				for(int k=lc;k>=fc;k--){
					System.out.print(arr[lr][k]+" ");
					total--;
				}
				lr=lr-1;
			}
			else{
				for(int l=lr;l>=fr;l--){
					System.out.print(arr[l][fc]+" ");
					total--;
				}
				fc=fc+1;
			}
		}
	
	}
}