class Solution {
    public int longestOnes(int[] nums, int k) {
        int len = nums.length;
        int l = 0, r = 0;
        int zc = 0, cnt = 0, max = 0;
        while (r < len) {
            if (nums[r] == 0)
                zc++;
            if (zc > k) {
                while(zc>k){
                    if(nums[l]==0)  zc--;
                    l++;
                }
            }
            max = Math.max(max, r-l+1);
            r++;
        }
        return max;
    }
}