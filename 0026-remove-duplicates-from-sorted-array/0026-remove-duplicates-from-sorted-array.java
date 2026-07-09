class Solution {
    public int removeDuplicates(int[] arr) {
        ArrayList<Integer> al = new ArrayList<>();
        boolean [] visited= new boolean[arr.length];
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(!visited[i]){
                count++;
                al.add(arr[i]);
                for(int j=i+1;j<arr.length;j++){
                    if(arr[i]==arr[j]){
                        visited[j]=true;
                    }
                }   
            }else{
                arr[i]='_';
            }
        }
        System.out.println(al);
        for (int i = 0; i < al.size(); i++) {
            arr[i] = al.get(i);
        }
        return count;
    }
}