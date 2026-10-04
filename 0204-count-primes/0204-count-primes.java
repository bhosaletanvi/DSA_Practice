// class Solution {
//     public int countPrimes(int n) {
//         int count=0;
//                     int i=2;

//         while(n!=1){
//             if(i<=n){
//                 if(i%n==0){
//                     if(i==n){
//                         count++;
//                         i=2;
//                     }else{
//                         n--;
//                         i=2;
//                     }
//                 }else{
//                     i++;
//                     continue;
//                 }
                
//             }else{
//                 n--;
//                 i=2;
//             }
//         }
//         return count;
//     }
// }
class Solution {
    public int countPrimes(int n) {
        boolean[] seen = new boolean[n];
        int ans = 0;
        for (int num = 2; num < n; num++) {
            if (seen[num]) continue;
            ans += 1;
            for (long mult = (long)num * num; mult < n; mult += num)
                seen[(int)mult] = true;
        }
        return ans;
    }
}