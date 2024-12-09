class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> ls= new ArrayList<>();
        findCombination(0,target,candidates,res,ls);
        return res;
    }
    public void findCombination(int idx, int tar, int[] candidates,
    List<List<Integer>> res, List<Integer> ls){
        if(idx==candidates.length){
            if(tar == 0){
                res.add(new ArrayList<>(ls));
            }
            return;
        }
        if(candidates[idx]<=tar){
            ls.add(candidates[idx]);
            findCombination(idx,tar-candidates[idx],candidates,res,ls);
            ls.remove(ls.size()-1);
        }
        findCombination(idx+1,tar,candidates,
        res,ls);
    }
}