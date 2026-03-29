public class Automorphic {
    public static void main(String[] args) {
        int n=11;
        int sq=n*n; //625
         while(n!=0){
            if(n%10!=sq%10){
                System.out.println("Not Automorphic No ");
            }
            n=n/10;
            sq=sq/10;
         }
           System.out.println("Automorphic NO");
    }
}
