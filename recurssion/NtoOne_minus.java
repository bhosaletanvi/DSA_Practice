public class NtoOne_minus {
    public static void main(String[] args) {
        int n=3;
        fun(n,n);
    }
    static void fun(int i,int n){
        if(i<1){
            return;
        }
        System.out.println(i);
        fun(i-1,n);
        
    }
}
