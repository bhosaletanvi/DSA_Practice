class q1{
    public static void main(String[] args) {
        int n=625;
        int og=n;
        int count=1;
        int val=0;
        while(n!=0){
            if(count<=2){
            int digit=n%10;
            val=val*10+digit;
            n=n/10;
            count++;}
        }
        int val2=0;
        while(val!=0){
            int digit2=val%10;
            val2=val2*10+digit2;
            val=val/10;
        }
        int sq=val2*val2;
        if(sq==og){
            System.err.println("correct No");
        }
        else{
            System.err.println("not correct No");
        }
    }
}