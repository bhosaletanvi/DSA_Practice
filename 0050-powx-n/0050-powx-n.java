class Solution {
    public double myPow(double x, int n) {
        // double ans=1;
        // if(n>=0){
        //     for(int i=1;i<=n;i++){
        //         ans*=x;
        //     }
        // }else{
        //     ans=x;
        //     for(int i=0;i>=n;i--){
        //         ans/=x;
        //     }
        // }
        // return ans;
        double ans = Math.pow(x,n);
        return ans;
    }
}