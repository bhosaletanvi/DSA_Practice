class Solution {
    public String findDifferentBinaryString(String[] arr) {
        StringBuilder sb = new StringBuilder();
        int length=arr[0].length();
        int index=0;
        while(index<length){
            int count=0;
            for(int i=0;i<arr.length; i++){
                if(arr[i].charAt(index)=='0'){
                    count++;
                }
            }
            if(count!=0){
                sb.append(1);
                for(int i=0;i<arr.length;i++){
                    if(sb.toString().equals(arr[i])){
                        sb.setCharAt(sb.length()-1,'0');
                    }
                }
            }else{
                sb.append(0);
                for(int i=0;i<arr.length;i++){
                    if(sb.toString().equals(arr[i])){
                        sb.setCharAt(sb.length()-1,'1');
                    }
                }
            }
            index++;
        }
        return sb.toString();
    }
}