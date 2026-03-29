public class OnetoN_plus {
    public static void main(String[] args) {
        int n=3;
        fun(1,n);
    }
    static void fun(int i ,int n){
        if(i>n){
            return;
        }
        System.out.println(i);
        fun(i+1,n);
    }
}
