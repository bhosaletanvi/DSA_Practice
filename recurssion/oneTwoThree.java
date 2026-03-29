public class oneTwoThree {
    public static void main(String[] args) {
        int n=5;
        f(n);
    }
    static void f(int n){
        if(n==0){
            System.out.println("500");
            return;
        }
        System.out.println("100");
        f(n-1);
        System.out.println("200");
        f(n-1);
        System.out.println("300");
    }
}
