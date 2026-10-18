class Solution {
    public boolean hasSameDigits(String s) {
        StringBuilder sb= new StringBuilder();
        while(s.length()>2){
            sb.setLength(0);
            for(int i=0;i<s.length()-1;i++){
                int num=(s.charAt(i)+s.charAt(i+1))%10;
                sb.append(num);
            }
            s=sb.toString();
        }
        if(s.charAt(0)==s.charAt(1)){
            return true;
        }
        return false;
    }
}