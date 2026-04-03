
import java.util.HashMap;

 class hashmap{
    public static void main(String[] args) {
        String str ="swiss";
        HashMap<Character,Integer> hm =new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            hm.put(str.charAt(i),hm.getOrDefault(str.charAt(i), 0)+1);
        }
        for(Character key : hm.keySet()){
            if(hm.get(key)==1){
                System.out.println(key);
                break;
            }
        }
        
    }
}
