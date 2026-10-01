class Solution {
    public boolean isValid(String sb) {
       Stack<Character> st = new Stack<>();
       for(int i=0;i<sb.length();i++){
        if(sb.charAt(i)=='[' || sb.charAt(i)=='(' || sb.charAt(i)=='{'){
            st.push(sb.charAt(i));
        }else{
            if(st.isEmpty()){
                return false;
            }
            char top = st.pop();
            System.out.println(top);
            System.out.println(sb.charAt(i));
             if ((top == '(' && sb.charAt(i) != ')') ||
                    (top == '{' && sb.charAt(i) != '}') ||
                    (top == '[' && sb.charAt(i) != ']')) {
                    return false;
                }
        }
       }
       return st.isEmpty();
            
    }
}