class Solution {
    public int strStr(String s, String needle) {
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch==needle.charAt(0)){
                boolean flag=true;
                int k=i;
                for(int j=0;j<needle.length();j++){
                    if(k>s.length()-1){
                        flag=false;
                        break;
                    }
                    if(s.charAt(k)!=needle.charAt(j)){
                        flag=false;
                        break; 
                    }
                    
                    k++;
                }
                if(flag){
                    return i;
                }
            }
        }
        return -1;
    }
}