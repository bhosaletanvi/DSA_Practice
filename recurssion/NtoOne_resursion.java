// recurssion using count variable
import java.util.Scanner;
public class NtoOne_resursion {
    public static void main(String[] args) {
     Scanner sc= new Scanner(System.in);
     System.out.println("Enter Number ");
     int n=sc.nextInt();
     fun(n);   
    }
    static void fun(int count){
        if(count<1){
            return;
        }
        System.out.println(count);
        count--;
        fun(count);

    }
}
