class Solution {
    public int countUnguarded(int m, int n, int[][] guards, int[][] walls) {
        int[][] matrix = new int[m][n];
        int count = 0;
        int g = guards.length;
        int w = walls.length;
        for(int i = 0;i<g;i++){
            matrix[guards[i][0]][guards[i][1]] = 2;
            count++;
        }
        for(int i = 0;i<w;i++){
            matrix[walls[i][0]][walls[i][1]] = 1;
            count++;
        }
        for(int i = 0;i<g;i++){
            int r = guards[i][0];
            int c = guards[i][1];
            for(int j = r-1; j>=0 && (matrix[j][c]==0||matrix[j][c]==-1);j--){
                if(matrix[j][c]!=-1){
                    count++;
                    matrix[j][c] = -1;
                }
            }
            for(int j = r+1; j<m && (matrix[j][c]==0||matrix[j][c]==-1);j++){
                if(matrix[j][c]!=-1){
                    count++;
                    matrix[j][c] = -1;
                }
            }
            for(int j = c-1; j>=0 && (matrix[r][j]==0||matrix[r][j]==-1);j--){
                if(matrix[r][j]!=-1){
                    count++;
                    matrix[r][j] = -1;
                }
            }
            for(int j = c+1; j<n && (matrix[r][j]==0||matrix[r][j]==-1);j++){
                if(matrix[r][j]!=-1){
                    count++;
                    matrix[r][j] = -1;
                }
            }
        }
        return n*m-count;
    }
}