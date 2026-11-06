class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length()==0){
            return true;
        }
        boolean flag  =false;
        int index=0;
        for(int i=0;i<s.length();i++){
            flag=false;
            for(int j=index;j<t.length();j++){
                if(s.charAt(i)==t.charAt(j)){
                    flag=true;
                    index=j+1;
                    break;
                }
            }
            if(!flag){
                break;
            }
            
        }
        return flag;
    }
}