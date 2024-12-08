class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        String s = "";
        generate(n, 0, 0, s, res);
        return res;
    }

    public void generate(int n, int open, int close, String s, List<String> res) {
        if (close == n) {
            res.add(s);
            return;
        }
        if (open < n)
            generate(n, open + 1, close, s + "(", res);
        if (close < open)
            generate(n, open, close + 1, s + ")", res);
    }
}