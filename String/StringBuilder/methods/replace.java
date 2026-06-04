class demo{
	public static void main(String [] args){
		StringBuilder sb =new StringBuilder("CodeGuruCool");
		System.out.println(sb);
		System.out.println(sb.length());
		System.out.println(sb.capacity());

		sb.replace(5,8,"tanvi");
		System.out.println(sb);

		System.out.println(sb);
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		
	}
}