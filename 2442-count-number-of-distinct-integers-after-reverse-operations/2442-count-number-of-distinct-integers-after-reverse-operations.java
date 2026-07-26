class Solution {
    public int countDistinctIntegers(int[] arr) {
        HashSet <Integer> hs = new HashSet<>();
        int rev=0;
        for(int i=0;i<arr.length;i++){
            rev=0;
            hs.add(arr[i]);
            if(arr[i]>=10){
                while(arr[i]>0){
                    rev=rev*10+(arr[i]%10);
                    arr[i]/=10;
                }
                hs.add(rev);
            } 
        }
        return hs.size();
    }
}