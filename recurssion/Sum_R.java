public class Sum_R {
    public static void main(String[] args) {
        int n=4;
        int sum=0;
        fun(sum,n);
    }
    static void fun(int sum,int n){
        if(n<1){
            System.out.println("Sum : "+sum);
            return;
        }
        sum=sum+n;
        fun(sum,n-1);
    }
}
