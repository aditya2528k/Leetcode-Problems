class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        fun(ans, "", 0, 0, n);
        return ans;
    }
    void fun(List<String> ans, String s, int open, int close, int n) {
        if (s.length() == 2 * n) {
            ans.add(s);
            return;
        }
        if (open < n) {
            fun(ans, s + "(", open + 1, close, n);
        }
        if (close < open) {
            fun(ans, s + ")", open, close + 1, n);
        }
    }
}