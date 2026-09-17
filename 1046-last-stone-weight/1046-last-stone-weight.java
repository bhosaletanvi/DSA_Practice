class Solution {
    public int lastStoneWeight(int[] arr) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<arr.length;i++){
            pq.offer(arr[i]);
        }
        while(pq.size()>1){
            int stone1=pq.poll();
            int stone2=pq.poll();
            if(stone1!=stone2){
                int ans = stone1-stone2;
                pq.offer(ans);
            }
        }
        if(pq.isEmpty()){
            return 0;
        }
        return pq.peek();
    }
}