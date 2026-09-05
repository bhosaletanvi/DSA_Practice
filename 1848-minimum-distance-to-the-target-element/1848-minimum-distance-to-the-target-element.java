class Solution {
    public int getMinDistance(int[] arr, int target, int start) {
        int min =Integer.MAX_VALUE;
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]==target){
                min=Math.min(min, Math.abs(i-start));
            }
        }
        return min;
    }
}