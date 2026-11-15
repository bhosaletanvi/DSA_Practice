class Solution {
    public List<Integer> spiralOrder(int[][] arr) {
        ArrayList<Integer> al = new ArrayList<>();
        int fr=0,lr=arr.length-1,fc=0,lc=arr[0].length-1,total=arr.length*arr[0].length,dir=-1;
        while(total!=0){
            dir=(dir+1)%4;
            if(dir==0){
                for(int i=fc;i<=lc;i++){
                    al.add(arr[fr][i]);
                    total--;
                }
                fr++;
            }else if(dir==1){
                for(int i=fr;i<=lr;i++){
                    al.add(arr[i][lc]);
                    total--;
                }
                lc--;
            }else if(dir==2){
                for(int i=lc;i>=fc;i--){
                    al.add(arr[lr][i]);
                    total--;
                }
                lr--;
            }else if(dir==3){
                for(int i=lr;i>=fr;i--){
                    al.add(arr[i][fc]);
                    total--;
                }
                fc++;
            }

        }
        return al;

    }
}