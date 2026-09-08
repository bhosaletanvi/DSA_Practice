class Solution {
    public int firstStableIndex(int[] arr, int k) {
        if(arr.length==1){
            return 0;
        }
        int max=Integer.MIN_VALUE,min=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            min=Integer.MAX_VALUE;
            max=Integer.MIN_VALUE;
            for(int j=0;j<=i;j++){
                max=Math.max(max,arr[j]);
            }
            for(int j=i;j<arr.length;j++){
                min=Math.min(min,arr[j]);
            }
            int score=max-min;
            if(score<=k){
                return i;
            }
        }
        return -1;
    }
}