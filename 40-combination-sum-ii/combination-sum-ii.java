class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);
        List<Integer> ls = new ArrayList<>();
        generate(candidates, target, 0, ls, ans);
        return ans;
    }

    public void generate(int[] arr, int target, int idx, List<Integer> ls, List<List<Integer>> res) {
        if (target == 0) {
            res.add(new ArrayList<>(ls));
            return;
        }
        for (int i = idx; i < arr.length; i++) {
            if (i > idx && arr[i] == arr[i - 1])    continue;
            if (arr[i] > target)    break;

            ls.add(arr[i]);
            generate(arr, target - arr[i], i+1, ls, res);
            ls.remove(ls.size() - 1);
        }
    }
}