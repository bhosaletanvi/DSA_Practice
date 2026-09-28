class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();

        helper(s, 0, new ArrayList<>(), ans);

        return ans;
    }

    public static void helper(String s, int index,
                               List<String> al,
                               List<List<String>> ans) {

        if(index == s.length()) {
            ans.add(new ArrayList<>(al));
            return;
        }

        for(int i = index; i < s.length(); i++) {

            String left = s.substring(index, i + 1);

            // Only choose palindrome substring
            if(isPalindrome(left)) {

                al.add(left);

                helper(s, i + 1, al, ans);

                // Backtrack
                al.remove(al.size() - 1);
            }
        }
    }

    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while(left < right) {
            if(str.charAt(left) != str.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}