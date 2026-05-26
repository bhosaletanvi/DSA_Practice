class demo{
	public static void main(String [] args){
		
		int rowstart=1,colstart=4;
		int [][] arr={
				{30,25,16,7,8,9},
				{29,24,15,6,1,2},
				{28,23,14,5,4,3},
				{27,22,13,12,11,10},
				{26,21,20,19,18,17},
			};
		int total = arr.length*arr[0].length;
		int fc=colstart,dir=-1,lc=fc+1,fr=rowstart,lr=fr+1;
		while(total!=0){
			dir=(dir+1)%4;
			if(dir==0){
				for(int i=fc;i<=lc;i++){
					System.out.print(arr[fr][i]+" ");
					total--;
				}
			
				if(fc<=0){
					fc=0;
				}else{
					fc--;
				}

				
			}
			else if(dir==1){
				for(int i=fr-1;i<=lr;i++){
					System.out.print(arr[i][lc]+" ");
					total--;
				}

				if(fr<=0){
					fr=0;
				}else{
					fr--;
				}

				
			}

			else if(dir==2){
				for(int i=lc-1;i>=fc;i--){
					System.out.print(arr[lr][i]+" ");
					total--;
				}
				if(lc>=arr[0].length-1){
					lc=arr.length-1;
				}else{
					lc++;
				}

				
			}
			else{
				for(int i=lr;i>=fr;i--){
					System.out.print(arr[i][fc]+" ");
					total--;
				}
				if(lr>=arr.length-1){
					lr=arr.length-1;
				}else{
					lr++;
				}
			}
		}

		}
	}
