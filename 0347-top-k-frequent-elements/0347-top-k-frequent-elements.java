class Solution {
    public int[] topKFrequent(int[] arr, int k) {
        HashMap<Integer,Integer>  hm = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
        }
        PriorityQueue<Integer> pq= new PriorityQueue<>(
            (a,b)->Integer.compare(hm.get(a),hm.get(b))
        );
        for(Integer key : hm.keySet()){
            pq.offer(key);
            if(pq.size()>k){
                pq.poll();
            }
        }
        int[] ans = new int[k];
        for(int i=0;i<ans.length;i++){
            ans[i]=pq.poll();
        }
        return ans;
    }
}