class Solution {
    public String addSpaces(String s, int[] arr) {
        int j=0;
        int num=0;
        StringBuilder sb = new StringBuilder();
        while(j!=arr.length){
            for(int i=num;i<arr[j];i++){
                sb.append(s.charAt(i));
            }
            sb.append(" ");
            num=arr[j];
            j++;
        }
         for(int i=num;i<s.length();i++){
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}