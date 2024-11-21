class Solution {
    public int matrixScore(int[][] grid) {
        int r = grid.length;
        int c = grid[0].length;
        int[] cols = new int[c];
        for(int i = 0;i<r;i++){
            boolean flag = false;
            if(grid[i][0]==0)   flag = true;
            for(int j = 0;j<c;j++){
                if(flag){
                    grid[i][j]^=1;
                }
                if(grid[i][j]==0){
                    cols[j]++;
                }
            }
        }
        for(int i = 0;i<c;i++){
            if(cols[i]>r/2){
                for(int j = 0;j<r;j++){
                    grid[j][i]^=1;
                }
            }
        }
        int res = 0;
        for(int i = 0;i<r;i++){
            int sum = 0;
            for(int j = 0;j<c;j++){
                sum+=(grid[i][j]<<(c-j-1));
            }
            res+=sum;
        }
        return res;
    }
}