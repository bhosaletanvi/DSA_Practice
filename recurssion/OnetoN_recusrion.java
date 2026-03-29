import java.util.*;
public class OnetoN_recusrion {
    public static void main(String[] args) {
     Scanner sc= new Scanner(System.in);
     System.out.print("Enter Number : ");
     int n=sc.nextInt();
     
      fun(n);
    }
    static int count=1;
    
    static void fun(int n){
        if(count>n){
            return;
        }
        System.out.println(count);
        count++;
        fun(n);
    }
}
