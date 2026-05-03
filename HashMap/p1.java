import java.util.HashMap;
class hashmap{
    public static void main(String [] args){
        //initialization 
        HashMap <String,Integer> hm =new HashMap<>();

        // adding elements
        hm.put("tanvi", 90);
        hm.put("saniya", 86);
        hm.put("sayali", 76);
        hm.put("ninad", 96);
        hm.put("vedant", 90);
        System.out.println(hm);
        hm.put("tanvi", 85);
        System.out.println(hm);
 	System.out.println(hm.containsKey("tanvi"));
        System.out.println(hm.get("saniya"));

        int marks=hm.get("tanvi");
        System.out.println(marks);
        System.out.println(hm.get("anushka"));
        hm.remove("sayali");
        System.out.println(hm);
        int ans=hm.remove("vedant");
        System.out.println(hm);
        System.out.println(ans);
        System.out.println(hm.size());

        for(String key : hm.keySet()){
            System.out.println(key);
        }
         
        System.out.println(hm.getOrDefault("ninad", 1000));
        System.out.println(hm.getOrDefault("anushka", 1000));


        HashMap <String , Integer> hm2 = new HashMap<>();
        System.out.println(hm2.isEmpty());
    }
}