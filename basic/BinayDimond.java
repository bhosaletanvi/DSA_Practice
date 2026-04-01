public class BinayDimond {
    public static void main(String[] args) {
        boolean check=true;
        for (int i = 1; i <=4; i++) {
            for (int j= 4; j>=i; j--) {
                check=!check;
                System.out.print(" ");
            }
            for (int k =i; k>=1; k--) {
                check=!check;
                if(check){
                    System.out.print(" 0");
                }
                else{
                    System.out.print(" 1");
                }
            }
            System.out.println();
        }
        for (int i =3; i>=1; i--) {
            for (int j=i; j<=4; j++) {
                check=!check;
                System.out.print(" ");
            }
            for (int k =i; k>=1; k--) {
                
                 if(check){
                    System.out.print(" 1");
                }
                else{
                    System.out.print(" 0");
                }
            }
            System.out.println();
        }
    }
}
