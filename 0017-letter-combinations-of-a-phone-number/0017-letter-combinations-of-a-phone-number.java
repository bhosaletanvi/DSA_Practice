// class Solution {
//     public List<String> letterCombinations(String digits) {
// 		LinkedList<String> ans = new LinkedList<String>();
// 		if(digits.isEmpty()) return ans;
// 		String[] mapping = new String[] {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
// 		ans.add("");
// 		for(int i =0; i<digits.length();i++){
// 			int x = Character.getNumericValue(digits.charAt(i));
// 			while(ans.peek().length()==i){
// 				String t = ans.remove();
// 				for(char s : mapping[x].toCharArray())
// 					ans.add(t+s);
// 			}
// 		}
// 		return ans;
// 	}
// }
class Solution {
    public List<String> letterCombinations(String digits) {
		return fun(0,digits);
	}
    static String[] arr = new String[] {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    static List<String> fun(int ind,String s){
        if(ind==s.length()){
            List<String> al = new ArrayList<>();
            al.add("");
            return al;
        }
        List<String> al = new ArrayList<>();
        List<String> ans = fun(ind+1,s);
        String str=arr[s.charAt(ind)-'0'];
        for(int i=0;i<ans.size();i++){
            for(int j=0;j<str.length();j++){
                al.add(str.charAt(j)+ans.get(i));
            }
        }
        return al;
    }
}