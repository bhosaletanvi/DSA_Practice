public class frequncy_array {
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
        int ans=0;
        for (int i = 0; i < arr.length; i++) {
           if(max<freq[i]){
            max=freq[i];
            ans=i;
           }
        }
        System.out.print(ans);
    }
}
