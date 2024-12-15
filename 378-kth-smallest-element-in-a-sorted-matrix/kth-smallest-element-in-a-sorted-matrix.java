class Solution {
    public int solve(int[][]matrix, int mid){
        int count = 0, n = matrix.length, i = n-1, j = 0;
        while(i >= 0 && j < n){
            if(matrix[i][j] > mid) i--;
            else{
                count += (i+1);
                j++;
            }
        }
        return count;
    }
    public int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length, i = matrix[0][0], j = matrix[n-1][n-1];
        while(i < j){
            int mid = i + (j-i)/2;
            int posi = solve(matrix, mid);
            if(posi < k) i = mid+1;
            else j = mid;
        }
        return i;
    }
}