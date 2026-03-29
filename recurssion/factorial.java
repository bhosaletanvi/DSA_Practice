import java.util.Scanner;
public class factorial {
    public static void  main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number :");
        int n=sc.nextInt();
        int f=fact(n);
        System.out.println("Factorial : "+f);
    }
    static int fact(int n){
        if(n==1){
            return 1;
        }
        int val=fact(n-1);
        return val*n;
    }
}
