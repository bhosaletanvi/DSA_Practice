class Solution {
    public int missingMultiple(int[] arr, int k) {
        int count=1;
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            hs.add(arr[i]);
        }
        while(count<=arr.length+1){
            if(!hs.contains(count*k)){
                    return count*k;
            }
            count++;
        }
           return -1;
    }
}