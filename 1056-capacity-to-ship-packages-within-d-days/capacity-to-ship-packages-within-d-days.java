class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int high = 0;
        int low = 0;
        for (int it : weights) {
            high += it;
            low = Math.max(low, it);
        }
        while (low <= high) {
            int mid = (low + high) / 2;
            if (checkCapacity(weights, mid, days))
                high = mid - 1;
            else
                low = mid + 1;
        }
        return low;
    }

    public boolean checkCapacity(int[] weights, int capacity, int days) {
        int d = 1;
        int occupied = 0;
        for (int weigth : weights) {
            if (weigth > capacity)
                return false;
            if (occupied + weigth <= capacity) {
                occupied += weigth;
            } else {
                occupied = weigth;
                d++;
            }
        }
        return d <= days;
    }
}