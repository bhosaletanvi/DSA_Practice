class Solution {
    public List<List<String>> groupAnagrams(String[] arr) {
       List<String> strs= new ArrayList<>();
        List<List<String>> ans = new ArrayList<>();
       boolean visited[] = new boolean[arr.length];
       for(int i=0;i<arr.length;i++){
        if(!visited[i]){
            String temp = arr[i];
            visited[i]=true;
            strs.add(temp);
            
            for(int j=i+1;j<arr.length;j++){
                String temp2=arr[j];
                
                boolean flag=true;
                flag=isAnagram(temp, temp2); 
                if(flag){
                    visited[j]=true;
                    strs.add(temp2);
                }    
        }
         ans.add(new ArrayList<>(strs));
            strs.clear();
        }
     }
            return ans;

    }
    public boolean isAnagram(String s1, String s2) {

    if (s1.length() != s2.length())
        return false;

    int[] freq = new int[26];

    for (int i = 0; i < s1.length(); i++) {
        freq[s1.charAt(i) - 'a']++;
        freq[s2.charAt(i) - 'a']--;
    }

    for (int x : freq) {
        if (x != 0)
            return false;
    }

    return true;
}
}