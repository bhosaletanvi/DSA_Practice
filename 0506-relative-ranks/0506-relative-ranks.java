class Solution {
    public String[] findRelativeRanks(int[] arr) {
        String[] ans = new String[arr.length];
        int count=1;
        while(count<=arr.length){
            int max=Integer.MIN_VALUE,maxindex=0;

            for(int i=0;i<arr.length;i++){
                if(max<arr[i]){
                    max=arr[i];
                    maxindex=i;
                }
            }

            if(count==1){
                ans[maxindex]="Gold Medal";
            }
             else if(count==2){
                ans[maxindex]="Silver Medal";
            }else  if(count==3){
                ans[maxindex]="Bronze Medal";
            }else{
                ans[maxindex]=String.valueOf(count);
            }
            arr[maxindex]=Integer.MIN_VALUE;
            count++;
        }
        return ans;
    }
}