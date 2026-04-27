import java.util.*;
class demo {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Array Size : ");
        int size =sc.nextInt();
	int [] arr=new int [size];
	System.out.print("Enter Array Elements : ");
	for(int i =0; i<arr.length;i++){
		arr[i]=sc.nextInt();
	}
	int ans =missing(arr);
	System.out.print(ans+" is Missing");
}
	static int missing(int [] arr){
	int arrayXOR =0,totalXOR=0;
	for(int i =0;i<arr.length;i++){
		arrayXOR =arrayXOR ^ arr[i];
	}
	
	for(int i =1;i<arr.length+1;i++){
		totalXOR =totalXOR ^ i;
	}
	return arrayXOR ^ totalXOR;
	}

}