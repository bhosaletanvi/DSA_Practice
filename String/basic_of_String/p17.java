class demo{
	public static void main(String [] args){
		String s= "TaNvi";
		int count=0;
		for(int i=0;i<s.length()-1;i++){
			if(s.charAt(i)>=65 && s.charAt(i)<=90){
				count++;
			}
		}
		System.out.print(count);
	}
}