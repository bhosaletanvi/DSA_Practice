class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            char top = s.charAt(i);
           if(st.isEmpty() || st.peek() != top){
                st.push(top);
            }else{
                st.pop();
            }
        }
        StringBuilder sb = new StringBuilder();

        for (char ch : st) {
            sb.append(ch);
        }

        return sb.toString();
         
    }
}