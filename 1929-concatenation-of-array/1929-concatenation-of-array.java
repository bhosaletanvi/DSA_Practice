class Solution {
    public int[] getConcatenation(int[] arr) {
        int ans []= new int[arr.length+arr.length];
        int index=0;
        for(int i=0;i<arr.length;i++){
            ans[index]=arr[i];
            index++;
        }

        for(int i=0;i<arr.length;i++){
            ans[index]=arr[i];
            index++;
        }
        return ans;
    }
}