class Solution {
    public boolean canAliceWin(int num) {
        if(num<10){
            return false;
        }
        num-=10;
        int c=9;
        boolean alice=true;
        if(num<c){
            return alice;
        }
        while(num>=c){
            num-=c;
            c--;
            alice=false;
            if(num<c){
                break;
            }
            num-=c;
            c--;
            alice=true;
            
        }
        return alice;
    }
}