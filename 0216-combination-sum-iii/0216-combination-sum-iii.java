class Solution {
    List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> combinationSum3(int k, int n) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        fun(0, new ArrayList<>(), arr, 0, n, k);

        return ans;
    }

    void fun(int index, List<Integer> al, int[] arr, int sum, int n, int k) {

        if (index == arr.length) {
            if (al.size() == k && sum == n) {
                ans.add(new ArrayList<>(al));
            }
            return;
        }

        // Take
        al.add(arr[index]);

        fun(index + 1, al, arr, sum + arr[index], n, k);

        // Backtrack
        al.remove(al.size() - 1);

        fun(index + 1, al, arr, sum, n, k);
    }
}