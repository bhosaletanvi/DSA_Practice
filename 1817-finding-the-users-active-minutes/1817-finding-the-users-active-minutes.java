class Solution {
    public int[] findingUsersActiveMinutes(int[][] arr, int k) {
        boolean []visited = new boolean[arr.length];
        HashMap <Integer , Integer> hm = new HashMap<>();
        HashSet <Integer> hs = new HashSet<>();
        int [] ans = new int [k];
        for(int i=0;i<arr.length;i++){
            if(!visited[i]){
                int id = arr[i][0];
                
                for(int j=0;j<arr.length;j++){
                    if(arr[j][0]==id){
                        visited[j]=true;
                        hs.add(arr[j][1]);
                    }
                }
                hm.put(id,hs.size());
                hs.clear();
            }
        }
        for(Integer key : hm.keySet()){
            ans[hm.get(key)-1]++;
        }
        return ans;
    }
}