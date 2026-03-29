public class p1 {
    public static void main(String[] args) {
        int n=5;
        fun(n);
    }
    static void  fun(int n){
        if(n==0){
            return;
        }
        System.out.println("Start : "+n);
        fun(n-1);
        System.out.println("End : "+n);
    }

}
