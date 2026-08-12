class Solution {
    public int removeElement(int[] arr, int val) {
        int count=0;
        int ans[] = new int[arr.length];
        int index=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=val){
                ans[index]=arr[i];
                index++;
                count++;
            }
        }
        for(int i=0;i<arr.length;i++){
            arr[i]=ans[i];
        }
        return count;
    }
}