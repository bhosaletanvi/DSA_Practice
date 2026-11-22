class Solution {
    public boolean checkString(String s) {
        boolean Bis=false;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='b'){
                Bis=true;
            }else{
                if(Bis){
                    return false;
                }
            }
        }
        
        return true;
    }
}