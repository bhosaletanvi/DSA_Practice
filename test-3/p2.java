class demo{
	public static void main(String [] args){
		int n=5;
		int num=1;
		for(int i=0;i<n;i++){
			num=1;
			for(int j=n;j>i;j--){
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++){
				System.out.print(num+" ");
				num=num*(i-k)/(k+1);
			}
			System.out.println();
		}
	}
}