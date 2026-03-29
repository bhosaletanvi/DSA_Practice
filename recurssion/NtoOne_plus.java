public class NtoOne_plus {
    public static void main(String[] args) {
        int n=3;
        fun(1,n);
    }
    static void fun(int i,int n){
        if(i>n){
            return;
        }
        fun(i+1,n);
        System.out.println(i);
    }
}
