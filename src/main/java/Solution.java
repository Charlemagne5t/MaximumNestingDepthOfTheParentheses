class Solution {
    public int maxDepth(String s) {
        int res = 0;
        int c = 0;
        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                c++;
                res = Math.max(res, c);
            } else if (ch == ')') {
                c--;
            }
        }
        return res;
    }
}