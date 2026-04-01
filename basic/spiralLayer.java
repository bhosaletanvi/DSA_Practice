import java.util.*;
public class spiralLayer{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n=sc.nextInt();
        int total_rows=2*n-1;
        int total_cols=2*n-1;
        for (int i = 1; i <=total_rows; i++) {
            for (int j = 1; j <=total_cols; j++) {
                int top = i-1;
                int bottom= 2*n-1-i;
                int left =j-1;
                int right=2*n-1-j;
                int smallestTopBottom=Math.min(top, bottom);
                int smallestLeftRight=Math.min(left, right);
                int smallest=Math.min(smallestTopBottom,smallestLeftRight);
                int layer_no=smallest;
                System.out.print(" "+(n-layer_no));
                
            }
            System.out.println();
        }
    }
}