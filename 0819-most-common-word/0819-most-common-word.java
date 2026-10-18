class Solution {
    public String mostCommonWord(String str, String[] banned) {
         str = str.toLowerCase();
        str = str.replaceAll("[^a-z\\s]", " ");

        String[] arr = str.trim().split("\\s+");

       
       HashMap<String,Integer> hm = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            boolean flag=true;
            for(int j=0;j<banned.length;j++){
                if(arr[i].equals(banned[j])){
                    flag=false;
                    break;
                }
            }
            if(flag){
                hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
            }
        }
        int max =0;
        String ans="" ;
        for(String key : hm.keySet()){
                        System.out.println(key+"->"+hm.get(key));
                if(hm.get(key)>max){
                    max=hm.get(key);
                    ans=key;
                }
        }
        return ans; 
    }
}