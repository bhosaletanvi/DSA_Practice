// recurssion without using another variavble (use -)
import java.util.Scanner;
public class OnetoN_ {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n =sc.nextInt();
        fun(n,n);

    }
    static void  fun(int i,int n){
        if(i<1){
            return;
        }
        fun(i-1,n);
        System.out.println(i);
    }
    
}

