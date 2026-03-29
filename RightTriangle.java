import java.util.*;
public class RightTriangle {
    void main(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n=sc.nextInt();
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }




        // int i,j;
        // for(i=1;i<=5;i++){
        //     for(j=1;j<=5;j++){
        //         if(i==j || i>j){
        //             System.out.print(" *");
        //         }
        //         else{
        //             System.out.print("  ");
        //         }
        //     }
        //     System.out.println();
    //     }

    }
    
}
