class Solution {
    public int largestRectangleArea(int[] arr) {
       Stack<Integer> st = new Stack<>();
       int left[]= new int[arr.length];
       int right[] = new int[arr.length];
       for(int i=0;i<arr.length;i++){
        while(!st.isEmpty() && arr[st.peek()]>=arr[i]){
            st.pop();
        }
        if(st.isEmpty()){
            left[i]=-1;
        }else{
            left[i]=st.peek();
        }
        st.push(i);
       }
       st=new Stack();
       for(int i=arr.length-1;i>=0;i--){
            while(!st.isEmpty() && arr[st.peek()]>=arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                right[i]=arr.length;
            }else{
            right[i]=st.peek();
        }
        st.push(i);
       }
       int max=0;
       for(int i=0;i<arr.length;i++){
            int size=right[i]-left[i]-1;
            max=Math.max(max,arr[i]*size);
       }
       return max;
    }
}