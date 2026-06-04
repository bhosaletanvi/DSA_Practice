class demo{
	public static void main(String [] args){
		char [] arr={'H','E','L','L','O'};
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		arr[2]='T';
		System.out.println();
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}
}