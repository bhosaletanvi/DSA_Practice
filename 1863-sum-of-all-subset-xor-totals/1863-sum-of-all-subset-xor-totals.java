class Solution {
    static int sum=0;
    public int subsetXORSum(int[] nums) {
        sum=0;
        fun(nums,0,0,new ArrayList<>());
        return sum;
    }
    static void fun(int arr[],int i,int xor,ArrayList<Integer> al){
        if(i==arr.length){
                sum+=xor;
                return;
        }
        al.add(arr[i]);
        fun(arr,i+1,xor^arr[i],al);
        al.remove(al.size()-1);
        fun(arr,i+1,xor,al);
    }
}