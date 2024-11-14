class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;
        int low = 1;
        int high = 1000000000;
        int res = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int hour = 0;
            for (int i = 0; i < n; i++) {
                hour += Math.ceil(piles[i] * 1d / mid);
            }
            if (hour > h)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return low;
    }
}