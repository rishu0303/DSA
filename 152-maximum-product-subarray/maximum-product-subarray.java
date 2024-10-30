class Solution {
    public int maxProduct(int[] nums) {
        int len = nums.length-1;
        int max = Integer.MIN_VALUE;
        int pre = 1;
        int suf = 1;
        for(int i = 0;i<=len;i++){
            pre *= nums[i];
            max = Math.max(max, pre);
            suf*=nums[len-i];
            max = Math.max(max,suf);
            if(pre==0)  pre = 1;
            if(suf==0)  suf = 1;
        }
        return max;
    }
}