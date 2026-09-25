class Solution {
    public int minOperations(int[] arr, int k) {
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum%k;
    }
}