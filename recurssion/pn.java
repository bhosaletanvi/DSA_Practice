import java.util.Scanner;
public class pn {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n= sc.nextInt();
        int sum=0;
        System.out.println("sqrt : "+Math.sqrt(n));
        for (int i = 1; i < Math.sqrt(n); i++) {
            if(n%i==0){
                System.out.print(" "+i);
                
                    
                        sum=sum+(i);
                    
                    
                    if(i!=n/i){
                       System.out.print(" "+(n/i));
                       if(i!=1){
                        sum=sum+(n/i);
                       }
                    }
                }    
                
            }
        
        if(sum==n){
                  System.out.print("Perfect : "+sum);
        }
        else{
             System.out.print("not Perfect "+sum);
        }
         
    }
}
