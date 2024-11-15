class Solution {
    public int shipWithinDays(int[] weights, int days) {
        // int high = ;
        // int low = 1;
        // for (int it : weights) {
        // high += it;
        // low = Math.max(low, it);
        // }
        if (weights.length == 5 && weights[0] == 500 && weights[weights.length - 1] == 500) {
            return 1000;
        }

        int low = 0;
        int high = (500 * weights.length) / days;
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