class Solution {
    public boolean exist(char[][] arr, String str) {
        for(int i=0;i<arr.length;i++){
            for(int j =0;j<arr[0].length;j++){
                if(helper(str,arr,i,j,0)){
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean helper(String str,char[][] arr,int sr,int sc,int index){
        if(index==str.length()){
            return true;
        }
        if(sr<0 || sr>=arr.length|| sc<0 || sc>=arr[0].length){
            return false;
        }
        if(arr[sr][sc]!=str.charAt(index)){
            return false;
        }
        char og=arr[sr][sc];
        arr[sr][sc]='?';
        boolean right=helper(str,arr,sr,sc+1,index+1);
        boolean left=helper(str,arr,sr,sc-1,index+1);
        boolean top=helper(str,arr,sr-1,sc,index+1);
        boolean bottom=helper(str,arr,sr+1,sc,index+1);
        arr[sr][sc]=og;
        if(right||left||top||bottom){
            return true;
        }
        return false;
    }
}