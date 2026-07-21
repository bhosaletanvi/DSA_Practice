class Solution {
    public int maximumDifference(int[] arr) {
        int min=arr[0],index=0;
        int diff=-1;
        for(int i=0;i<arr.length;i++){
                for(int j=i+1;j<arr.length-1;j++){
                    if(arr[j]>arr[i]){
                        diff=Math.max(arr[j]-arr[i],diff);
                    }
                }
        }
        if(arr[arr.length-1]>arr[0]){
            diff=Math.max(arr[arr.length-1]-arr[0],diff);
        }
        
        return diff;
    }
}