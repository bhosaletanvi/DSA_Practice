
import java.util.HashMap;

public class hashmap {
    public static void main(String[] args) {
        int[] arr={1,2,1,3,2,1};
        HashMap <Integer,Integer> hm =new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            hm.put(hm.get(arr[i]),hm.getOrDefault(arr[i],0)+1);
        }
        int max=0;
        int ans=0;
        for(Integer key: hm.keySet()){
            if(hm.get(key)>max){
                max=hm.get(key);
                ans=key;
            }
        }
        System.out.print(ans);
    }
}
