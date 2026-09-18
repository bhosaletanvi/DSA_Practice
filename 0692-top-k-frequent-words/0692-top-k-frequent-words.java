class frequencies implements Comparable<frequencies>{
    String str;
    int freq;
    frequencies(String str,int freq){
        this.str=str;
        this.freq=freq;
    }
    @Override
public int compareTo(frequencies other) {

     if (this.freq == other.freq) {
            return this.str.compareTo(other.str);
        }

    return Integer.compare(other.freq, this.freq);
}
}
class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        PriorityQueue<frequencies> pq= new PriorityQueue<>(
            // (a,b)->Integer.compare(b.freq,a.freq)
        );
        HashMap<String , Integer> hm = new HashMap<>();
        for(int i=0;i<words.length;i++){
            hm.put(words[i],hm.getOrDefault(words[i],0)+1);
        }
        for(String key : hm.keySet()){
            pq.add(new frequencies(key,hm.get(key)));
        }
        ArrayList<String> al = new ArrayList<>();
        while(k!=0){
            al.add(pq.poll().str);
            k--;
        }
        return al;
    }
}