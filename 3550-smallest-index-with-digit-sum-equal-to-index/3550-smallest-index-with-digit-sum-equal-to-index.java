class Solution {
    public int smallestIndex(int[] arr) {
        int ans=-1;
        for(int i=0;i<arr.length;i++){
            int num=arr[i],sum=0;
            while(num>0){
                int digit = num%10;
                sum+=digit;
                num/=10;
            }
            if(sum==i){
                ans=i;
                break;
            }
        }
        return ans;
    }
}