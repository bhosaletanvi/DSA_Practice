class Solution {
    public int addDigits(int num) {
       // while(num>9){
            int sum=0;
            while(num!=0){
                int digit=num%10;
                sum=sum+digit;
                num/=10;
                if(num==0){
                    if(sum<10){
                        return sum;
                    }
                    num=sum;
                    sum=0;
                }
            }
           // num=sum;
       // }
        return num;
    }
}