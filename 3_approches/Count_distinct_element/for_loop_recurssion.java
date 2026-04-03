 class for_loop_recurssion {
    public static void main(String[] args) {
        int [] arr={1,2,1,3,2,1};
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            int ans=f(arr,arr[i]);
            if(ans==1){
                count++;
            }
        }
        System.out.print("array have "+count+" distinct elements");
    }
    static int f(int[] arr,int num){
        int count=0;
        for (int i = 0; i < arr.length; i++) {
           if(arr[i]==num){
            count++;
           } 
        }
        return  count;
    }
}
