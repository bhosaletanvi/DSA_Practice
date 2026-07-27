class Solution {
    public int mostFrequentEven(int[] arr) {
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            max=Math.max(max,arr[i]);
        }
        int freq[]= new int[max+1];
        for(int i=0;i<arr.length;i++){
            freq[arr[i]]++;
        }
        max=0;
        int maxindex=-1;
        for(int i=0;i<freq.length;i++){
            if(i%2==0){
                if(max<freq[i]){
                    max=freq[i];
                    maxindex=i;
                }
            }
        }
        return maxindex;
    }
}