class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        generate(0,nums.length, nums, new ArrayList<>(), list);
        return list;
    }
    public void generate(int i, int n, int[] arr,List<Integer> ls, List<List<Integer>> res){
        res.add(new ArrayList<>(ls));
        for(int start = i; start < n; start++) {
            if(start > i && arr[start] == arr[start - 1]) continue;
            ls.add(arr[start]);
            generate(start + 1, n, arr, ls, res);
            ls.remove(ls.size() - 1);
        }
    }
}