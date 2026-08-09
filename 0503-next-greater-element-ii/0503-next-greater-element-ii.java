class Solution {
    public int[] nextGreaterElements(int[] arr) {
        

        int ans[] = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            ans[i]=arr[i];
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]>arr[i]){
                    ans[i]=arr[j];
                    break;
                }
            }
            if(ans[i]==arr[i]){
                for(int j=0;j<i;j++){
                    if(arr[j]>arr[i]){
                        ans[i]=arr[j];
                        break;
                    }
                }
            }
            if(ans[i]==arr[i]){
                ans[i]=-1;
            }
        }
        
        return ans;
    }
}