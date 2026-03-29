import java.util.Scanner;
public class ChessBoard {
    void main(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number :");
        int n=sc.nextInt();
        int i,j;
        for(i=1;i<=n;i++){
            for(j=1;j<=n;j++){
                if(((i+j)%2==0)){
                    System.out.print(" *");
                }
                else{
                    System.out.print(" #");
                }
            }
            System.out.println();
        }
    }
    
}
