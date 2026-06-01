class demo{
	public static void main(String [] args){
		int first =27,n=0,max=0,count=0;
		while(first!=0){
			n=first;
			while(n!=0){
				int digit=n%10;
				max=Math.max(max,digit);
				n/=10;
			}
			first-=max;
			count++;	
		}
		System.out.print(count);
	}
}