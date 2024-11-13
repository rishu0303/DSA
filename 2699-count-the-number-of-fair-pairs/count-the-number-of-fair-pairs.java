class Solution {
    public long countFairPairs(int[] nums, int lower, int upper) {
        Arrays.sort(nums);
        int len = nums.length;
        long ans = 0;
        for (int i = 0; i < len - 1; i++) {
            int low = lowerBound(nums, i + 1, len, lower - nums[i]);
            int up = upperBound(nums, i + 1, len, upper - nums[i]);
            ans += up - low;
        }
        return ans;
    }
    private int lowerBound(int[] arr, int s, int e, int x) {
        while (s < e) {
            int mid = s + (e - s) / 2;
            if (arr[mid] >= x) e = mid;
            else s = mid + 1;
        }
        return s;
    }
    private int upperBound(int[] arr, int s, int e, int x) {
        while (s < e) {
            int mid = s + (e - s) / 2;
            if (arr[mid] > x) e = mid;
            else s = mid + 1;
        }
        return s;
    }
}