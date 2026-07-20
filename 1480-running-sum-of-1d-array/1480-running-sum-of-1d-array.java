class Solution {
    public int[] runningSum(int[] arr) {
        int ans[] = new int[arr.length];
        int sum=arr[0];
        int index=0;
        for(int i=1;i<arr.length;i++){
            ans[index]=sum;
            sum+=arr[i];
            index++;
        }
        ans[index]=sum;
        return ans;
    }
}