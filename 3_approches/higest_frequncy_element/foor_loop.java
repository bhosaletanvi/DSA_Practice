public class foor_loop {
    public static void main(String[] args) {
        int [] arr={1,2,1,3,2,1};
    int max=0,ans=0;
    for (int i = 0; i < arr.length; i++) {
        int count=f(arr ,arr[i]);
        if(max<count){
            max=count;
            ans=arr[i];
        }
        
    }
    System.out.print(ans);
    }
    static int f(int[]arr,int num){
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==num){
                count++;
            }
            
        }
        return count;
    }
    
}
