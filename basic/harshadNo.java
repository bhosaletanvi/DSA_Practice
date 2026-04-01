public class harshadNo {
    public static void main(String[] args) {
        int n=18;
        int original=n;
        int sum=0;
        while(n!=0){
            int digit=n%10;
            n=n/10;
            sum=sum+digit;
        }
        if(original==sum){
            System.out.println("Harshad Number ");
        }
        else{
            System.out.println("not a Harshad Number");
        }
    }
}
