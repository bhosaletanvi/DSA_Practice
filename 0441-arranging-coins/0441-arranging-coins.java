class Solution {
    public int arrangeCoins(int n) {
        if(n==1){
            return 1;
        }
        int i=1;
        while(n>0){
            n=n-i;
            i++;
            if(n<i){
                return i-1;
            }
        }
        return 0;
    }
}