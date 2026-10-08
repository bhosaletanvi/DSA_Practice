class Solution {
    public char findTheDifference(String s, String t) {
        if(t.length()<s.length()+1){
            return '\0';
        }
       StringBuilder sb = new StringBuilder(s);
       for(int i=0;i<t.length();i++){
        if(sb.indexOf(String.valueOf(t.charAt(i)))==-1){
            return t.charAt(i);
        }
        sb.deleteCharAt(sb.indexOf(String.valueOf(t.charAt(i))));
       }
        return '\0';
    }
}