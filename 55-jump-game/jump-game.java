class Solution {
    public boolean canJump(int[] nums) {
        int max = 0, len = nums.length;
        for(int i = 0;i<len;i++){
            if(i>max)   return false;
            max = Math.max(max,i+nums[i]);
            if(max>=len)    return true;
        }
        return true;
    }
}