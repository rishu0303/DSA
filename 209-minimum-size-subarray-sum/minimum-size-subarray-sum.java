class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int sum = 0;
        int n = nums.length;
        int min = n+1;
        int  i = 0, j = 0;
        while(j<n){
            sum+=nums[j];
            while(sum>=target && i<=j){
                min = Math.min(min,j-i+1);
                sum-=nums[i];
                i++;
            }
            j++;
        } 
        if(min<=n)   return min;
        return 0; 
    }
}
