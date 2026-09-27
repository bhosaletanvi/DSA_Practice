class Solution {
    public List<List<Integer>> permuteUnique(int[] arr) {
        List<List<Integer>> ans = new ArrayList<>();
         fun(arr,new ArrayList<>() ,new boolean[arr.length],ans);
         return ans;
    }
    public static void fun(int arr[],List<Integer> al , boolean visited[], List<List<Integer>> ans){

        if(al.size()==arr.length){
            if(!ans.contains(al)){
                ans.add(new ArrayList<>(al));

            }
            return ;
        }
        for(int i=0;i<arr.length;i++){
            if(visited[i]){
                continue;
            }
            al.add(arr[i]);
            visited[i]=true;

            fun(arr,al,visited,ans);
            visited[i]=false;
            al.remove(al.size()-1);
            
        }
        return ;
    }
}