import java.util.Scanner;
public class Count_no {
        public static void main(String[] args) {
        int count=0;    
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter Number : "); 
       int n =sc.nextInt();
       while(n!=0){
        int digit=n%10;
        n=n/10;
        count++;
       }
       System.out.println("Total Digits in Number : "+count);
    }
}
    

