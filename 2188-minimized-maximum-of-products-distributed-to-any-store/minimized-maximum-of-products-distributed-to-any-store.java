class Solution {
    public int minimizedMaximum(int x, int[] quantities) {
        // int n = quantities.length;
        int low = 1;
        int high = 100000;
        while (low <= high) {
            int mid = (low + high)/2;
            int total = 0;
            for(int quantity : quantities) {
                total += (quantity+mid-1)/mid;
            }
            if (total > x)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return low;
    }
}