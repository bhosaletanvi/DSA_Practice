class Solution {
    public String convertDateToBinary(String date) {
        StringBuilder sb = new StringBuilder();
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i <= date.length(); i++) {

            if (i == date.length() || date.charAt(i) == '-') {

                int num = Integer.parseInt(sb.toString());

                StringBuilder temp = new StringBuilder();

                while (num > 0) {
                    temp.append(num % 2);
                    num /= 2;
                }

                ans.append(temp.reverse());

                if (i != date.length()) {
                    ans.append('-');
                }

                sb.setLength(0);

            } else {
                sb.append(date.charAt(i));
            }
        }

        return ans.toString();
    }
}