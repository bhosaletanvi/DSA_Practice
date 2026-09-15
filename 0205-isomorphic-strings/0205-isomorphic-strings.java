// class Solution {
//     public boolean isIsomorphic(String s, String t) {
//         StringBuilder sb = new StringBuilder();
//         for(int i=0;i<s.length();i++){
//             char ch = s.charAt(i);
//             sb.setLength(0);
//             for(int j=i;j<s.length();j++){
//                 if(ch==s.charAt(j)){
//                     sb.append(j);
//                 }
//             }
//             int digit=sb.charAt(0) - '0';
//             ch=t.charAt(digit);
//             for(int j=0;j<t.length();j++){
//                 if(t.charAt(j)==ch){
//                     if(!sb.toString().contains(String.valueOf(j))){
//                         return false;
//                     }
//                 }
//             }
//             for(int j=0;j<sb.length();j++){
//                 digit=sb.charAt(j) - '0';
//                 if(t.charAt(digit)!=ch){
//                     return false;
//                 }
//             }
//         }
//         return true;
//     }
// }
class Solution {
    public boolean isIsomorphic(String s, String t) {

        int[] mapS = new int[256];
        int[] mapT = new int[256];

        for (int i = 0; i < s.length(); i++) {

            char a = s.charAt(i);
            char b = t.charAt(i);

            if (mapS[a] != mapT[b]) {
                return false;
            }

            mapS[a] = i + 1;
            mapT[b] = i + 1;
        }

        return true;
    }
}