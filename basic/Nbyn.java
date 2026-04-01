import java.util.Scanner;
public class Nbyn{
public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    System.out.println("Enter Number : ");

    int n =s.nextInt();
    int i,j;
    for(i=1;i<=n;i++){
        for(j=1;j<=n;j++){
            System.err.print("* ");
        }
        System.out.println();
    }
}
}