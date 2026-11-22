class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> hm = new HashMap<>();
        for(int i=0;i<s.length();i++){
            hm.put(s.charAt(i),hm.getOrDefault(s.charAt(i),0)+1);
        }
        char ans=' ';
        s="";
        while(!hm.isEmpty()){
                int max=0;
                for(Character key : hm.keySet()){
                    if(hm.get(key)>max){
                        ans = key;
                        max=hm.get(key);  
                    }
                }
                for(int i=1;i<=max;i++){
                    s+=ans;
                }
                hm.remove(ans);
        }
        return s;
    }
}