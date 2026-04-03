class frequncy_array {
    public static void main(String[] args) {
        int[]arr={1,2,1,3,2,1};
        int max=0;
        for (int i = 0; i < arr.length; i++) {
           if(max<arr[i]){
            max=arr[i];
           }
        }
        int[] freq=new int[max+1];
        for (int i = 0; i < arr.length; i++) {
           freq[arr[i]]++;
        }
        
        int count=0;
        for (int i = 0; i < freq.length; i++) {
           if(freq[i]==1){
           count++;
           }
        }
        System.out.print("Array have "+count+" distinct elements ");
    }
}
