// class Solution {
   
//     public List<List<Integer>> combinationSum2(int[] arr, int target) {
//          List<List<Integer>> ans =new ArrayList<>();
//         Arrays.sort(arr);
//         fun(0,arr,ans,new ArrayList<>(), target , 0);
//         return ans;
//     }
//     public static void fun(int index,int arr[],List<List<Integer>> ans,ArrayList<Integer> al,int target,int sum){
//         if(sum==target){
//             if(!ans.contains(al)){
//                 ans.add(new ArrayList<>(al));
//             }
//             return ;
//         }
//         if(index==arr.length){
//             return ;
//         }
//         al.add(arr[index]);
//         fun(index+1,arr,ans,al,target,sum+arr[index]);
//         al.remove(al.size()-1);
//         fun(index+1,arr,ans,al,target,sum);
//         return ;
//     }
// }

class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List < List < Integer >> ans = new ArrayList < > ();
        Arrays.sort(candidates);
        findCombinations(0, candidates, target, ans, new ArrayList < > ());
        return ans;
    }
    static void findCombinations(int ind, int[] arr, int target, List < List < Integer >> ans, List < Integer > ds) {
        if (target == 0) {
            ans.add(new ArrayList < > (ds));
            return;
        }

        for (int i = ind; i < arr.length; i++) {
            if (i > ind && arr[i] == arr[i - 1]) continue;
            if (arr[i] > target) break;

            ds.add(arr[i]);
            findCombinations(i + 1, arr, target - arr[i], ans, ds);
            ds.remove(ds.size() - 1);
        }
    }
}