class Solution {
    public int numSubarraysWithSum(int[] nums, int k){
        return (solve(nums, k) - solve(nums, k - 1));
    }
    public int solve(int nums[], int k){
        if(k < 0) return 0;
        int start = 0;
        int end = 0;
        int len = nums.length;
        int sum = 0;
        int count = 0;
        while(end<len){
            sum+=nums[end];
            while(sum>k){
                sum-=nums[start++];
            }
            count = count+(end-start+1);
            end++;
        }
        return count;
    }
    // public int numSubarraysWithSum(int[] nums, int k) {
    //     HashMap<Integer,Integer> map = new HashMap<>();
    //     map.put(0,1);
    //     int len = nums.length;
    //     int count = 0;
    //     int sum = 0;
    //     int rem;
    //     for(int i = 0;i<len;i++){
    //         sum += nums[i];
    //         rem = sum-k;
    //         if(map.containsKey(rem)){
    //             count += map.get(rem);
    //         }
    //         map.put(sum, map.getOrDefault(sum, 0) + 1);
    //     }
    //     return count;
    // }
}