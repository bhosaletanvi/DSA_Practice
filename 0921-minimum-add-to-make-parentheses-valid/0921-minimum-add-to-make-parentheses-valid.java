import java.util.*;

class Solution {
    public int minAddToMakeValid(String s) {
        PriorityQueue<Character> pq = new PriorityQueue<>();
        int ans = 0;

        for (int i =0 ; i<s.length();i++) {
            char ch =s.charAt(i);
            if (ch == '(') {
                pq.add(ch);
            } else {
                if (!pq.isEmpty()) {
                    pq.poll();
                } else {
                    ans++;
                }
            }
        }

        ans += pq.size();

        return ans;
    }
}