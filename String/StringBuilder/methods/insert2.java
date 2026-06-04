class demo{
	public static void main(String [] args){
		StringBuilder sb =new StringBuilder("tanvi");
		System.out.println(sb);
		System.out.println(sb.length());
		System.out.println(sb.capacity());

		sb.insert(10,"Yash");
		System.out.println(sb);
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		
	}
}