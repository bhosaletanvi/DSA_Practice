class demo{
	public static void main(String [] args){
		StringBuilder sb =new StringBuilder("tanvi");
		System.out.println(sb);
		System.out.println(sb.length());
		System.out.println(sb.capacity());

		sb.append(10);
		System.out.println(sb);
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		
	}
}