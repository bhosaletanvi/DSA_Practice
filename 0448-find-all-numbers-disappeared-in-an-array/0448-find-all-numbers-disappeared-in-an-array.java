class Solution {
    public List<Integer> findDisappearedNumbers(int[] arr) {
        List<Integer> al = new ArrayList<>();
        // int max=arr[0];
        // for(int i=0;i<arr.length;i++){
        //     max=Math.max(arr[i],max);
        // }
        int [] freq= new int[arr.length+1];
        for(int i=0;i<arr.length;i++){
           freq[arr[i]]++;
        }
        for(int i=1;i<freq.length;i++){
            if(freq[i]==0){
                al.add(i);
            }
        }
        return al;
    }
}