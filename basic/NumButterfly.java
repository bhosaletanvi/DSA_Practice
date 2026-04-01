public class NumButterfly {
    public static void main(String[] args) {
        for (int i = 1; i <=4; i++) {
            for (int j = 1; j<=i ; j++){
              System.out.print(j);
            }
            for (int k =1; k <=2*(4-i); k++) {
                System.out.print(" ");
            }
            for (int m =i; m>=1; m--){
                System.out.print(m);
            }
            System.out.println();
        }


        for (int i =4; i>=1; i--) {
            for (int j = 1; j<=i; j++) {
                System.out.print(j);
            }
            for (int k = 1; k<=2*(4-i); k++) {
                System.out.print(" ");
            }
            for (int m=i; m>=1; m--){
               System.out.print(m);
            }
            System.out.println();
        }
    }
}
