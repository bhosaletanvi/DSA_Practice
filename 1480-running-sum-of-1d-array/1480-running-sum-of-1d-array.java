class Solution {
    public int[] runningSum(int[] arr) {
        int sum=arr[0];
        int i=0;
        for(i=0;i<arr.length-1;i++){
            arr[i]=sum;
            sum+=arr[i+1];
        }
        arr[i]=sum;
        return arr;
    }
}