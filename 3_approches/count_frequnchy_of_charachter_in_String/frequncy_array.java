 class frequncy_array {
    public static void main(String[] args) {
        String str ="apple";
        int [] freq=new int[26];
        for (int i = 0; i < freq.length; i++) {
            freq[str.charAt(i)-'a']++;
        }
        for (int i = 0; i < freq.length; i++) {
            if(freq[i]!=0){
                System.out.println((char)(i+'a')+" -> "+freq[i]);
            }
            
        }
    }
}
