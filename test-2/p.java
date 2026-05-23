class demo{
	public static void main(String [] args){
		int count=1,start=1,row=3,col=5,n=0;
			for(int i=1;i<=row;i++){
			count=start;
			for(int j=1;j<=col;j++){
				if(i%2==0){
					System.out.print(count+" ");
					count--;
				}else{
					System.out.print(count+" ");
					count++;

				}
			}
			if(i%2==0){
				start=count+(col+1);
			}else{
				start=count+(col-1);
			}
			System.out.println();

		}
	}
}