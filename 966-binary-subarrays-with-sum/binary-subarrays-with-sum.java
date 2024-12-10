class Solution {
    public int numSubarraysWithSum(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int len = nums.length;
        int count = 0;
        int sum = 0;
        int rem;
        for(int i = 0;i<len;i++){
            sum += nums[i];
            rem = sum-k;
            if(map.containsKey(rem)){
                count += map.get(rem);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
}