class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        long max = 0;
        int l = 0;
        int r = 0;
        int n = nums.length;
        long sum = 0;
        HashSet<Integer> set = new HashSet<>();
        while(r<n){
            if(!set.contains(nums[r])){
                sum+=nums[r];
                set.add(nums[r]);
                if(r-l+1==k){
                    if(max<sum) max = sum;
                    sum-=nums[l];
                    set.remove(nums[l++]);
                }
            }else{
                while(nums[l]!=nums[r]){
                    sum-=nums[l];
                    set.remove(nums[l]);
                    l++;
                }
                l++;
            }
            r++;
        }
        return max;
    }
}