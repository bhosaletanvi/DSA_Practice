class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> al = new ArrayList<>();
        helper(nums,0,al,result);
        return result;
    }
    public void helper(int[] nums,int index, List<Integer> al, List<List<Integer>> result){
        if(index == nums.length){
            result.add(new ArrayList<>(al));
            return;
        }
        al.add(nums[index]);
        helper(nums,index+1,al,result);
        
        al.remove(al.size()-1);
        helper(nums,index+1,al,result);
    }
}