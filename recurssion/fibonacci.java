import java.util.*;
public class fibonacci {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Position : ");
        int n=sc.nextInt();
        int ans = fun(n);
        System.out.print("Ans : "+ans);
    }
    static int fun(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        int last=fun(n-1);
        int second_last=fun(n-2);
        return last+second_last;
    } 
}