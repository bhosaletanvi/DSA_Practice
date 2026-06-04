class demo{
	public static void main(String [] args){
		StringBuilder sb =new StringBuilder("java");
		System.out.println(sb);
		System.out.println(sb.length());
		System.out.println(sb.capacity());

		sb.replace(0,4,"t");
		System.out.println(sb);

		sb.append("java");
		System.out.println(sb);
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		
	}
}