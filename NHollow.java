import java.util.Scanner;
public class NHollow {
     void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENter Number : ");
        int n =sc.nextInt();
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=n; j++) {
                // if((i<=(n-1) && i>=2 ) && (j<=(n-1) && j>=2)){
                if(i==1||i==n||j==1||j==n){
                    System.out.print(" *");
                }
                else{
                    System.out.print("  ");
                }
                
            }
            System.out.println();
        }
    }
}
