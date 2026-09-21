class Solution {

    List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] arr, int target) {

        fun(0, new ArrayList<>(), arr, 0, target);

        return ans;
    }

    void fun(int index, List<Integer> al, int[] arr, int sum, int target) {

        // Target reached
        if (sum == target) {
            ans.add(new ArrayList<>(al));
            return;
        }

        if (index == arr.length || sum > target) {
            return;
        }

        al.add(arr[index]);

        fun(index, al, arr, sum + arr[index], target);

        al.remove(al.size() - 1);

        fun(index + 1, al, arr, sum, target);
    }
}