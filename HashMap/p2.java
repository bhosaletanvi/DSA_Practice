import java.util.*;
class frequncy{
    public static void main(String[] args) {
        int [] arr={1,2,1,3,2,1};
        HashMap<Integer,Integer> hm =new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if(hm.containsKey(arr[i])){
                hm.put(arr[i], hm.get(arr[i])+1);
            }
            else{
                hm.put(arr[i], 1);
            }
        }
        System.out.println(hm);
    }
}
