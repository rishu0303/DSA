class Solution {
    public int matrixSum(int[][] nums) {
        int m = nums.length,n = nums[0].length, res = 0;
        for (int i = 0; i < m; i++) {
            Arrays.sort(nums[i]);
        }
        for (int j = 0; j < n; j++) {
            int tmp = 0;
            for (int i = 0; i < m; i++) tmp = Math.max(tmp, nums[i][j]);
            res += tmp;
        }
        return res;
    }
}