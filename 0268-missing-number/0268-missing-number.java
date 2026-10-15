class Solution {
    public int missingNumber(int[] arr) {
        int max=arr.length;
        int ans1=0;
      for(int i=0;i<arr.length;i++){
            ans1+=arr[i];
      }
      int ans2=0;
      for(int i=1;i<=max;i++){
        ans2+=i;
      }
      return ans2-ans1;
    }
}