class Solution {
    public List<Integer> targetIndices(int[] arr, int target) {
        for(int i=arr.length-1;i>=0;i--){
            boolean flag=true;
            for(int j=0;j<=i-1;j++){
                if(arr[j]>arr[j+1]){
                    flag=false;
                    int temp =arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }

            if(flag){
                break;
            }

        }
        ArrayList<Integer> al = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
            if(arr[i]==target){
                al.add(i);
            }
        }
        return al;
    }
}