class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ls = new ArrayList<>();
        generate(arr, n, 0, k, ls, ans);
        return ans;
    }
    public void generate(int[] arr, int target, int idx, int n, List<Integer> ls, List<List<Integer>> res) {
        if (target == 0 && ls.size()==n) {
            res.add(new ArrayList<>(ls));
            return;
        }
        for (int i = idx; i < arr.length; i++) {
            if (arr[i] > target || ls.size()>n)    break;
            ls.add(arr[i]);
            generate(arr, target - arr[i], i+1, n, ls, res);
            ls.remove(ls.size() - 1);
        }
    }
}