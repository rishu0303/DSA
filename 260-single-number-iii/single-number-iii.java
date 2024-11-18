class Solution {
    public int[] singleNumber(int[] nums) {
        int[] res = new int[2];
        Arrays.sort(nums);
        int n = nums.length;
        int index = 0;
        for(int i = 0;i<n-1;i++){
            if(nums[i]!=nums[i+1]){
                res[index++] = nums[i];
            }else i++;
        }
        if(index!=2) res[1] = nums[n-1];
        return res;
    }
}