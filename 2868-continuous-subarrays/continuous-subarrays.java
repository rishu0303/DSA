class Solution {
    public long continuousSubarrays(int[] nums) {
        long count = 0;
        int l = 0, r = 0, len = nums.length;
        int max = nums[0];
        int min = nums[0];
        while(r<len){
            min = Math.min(min,nums[r]);
            max = Math.max(max,nums[r]);
            if(max-min <= 2){
                count += (r-l+1);
                r++;
            }else {
                if(nums[l] == min) min = Integer.MAX_VALUE; 
                if(nums[l] == max) max = Integer.MIN_VALUE;
                l++;
                for(int i = l; i<=r; i++){
                    min = Math.min(min, nums[i]);
                    max = Math.max(max, nums[i]);
                }
            }
        }
        return count;
    }
}
