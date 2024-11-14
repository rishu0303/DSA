class Solution {
    public int minimizedMaximum(int x, int[] quantities) {
        int n = quantities.length;
        int low = 1;
        int high = 100000;
        int res = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int hour = 0;
            for (int i = 0; i < n; i++) {
                hour += Math.ceil(quantities[i] * 1d / mid);
            }
            if (hour > x)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return low;
    }
}