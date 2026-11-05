class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int ans=0;
        for(int i=0;i<arr1.length;i++){
            int min = Integer.MAX_VALUE;
            for(int j=0;j<arr2.length;j++){
                int temp = Math.abs(arr1[i]-arr2[j]);
                min=Math.min(min,temp);
            }
            if(min>d && min>0){
                ans++;
            }
        }
        return ans;
    }
}