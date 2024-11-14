class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length-1;
        int col = matrix[0].length-1;
        int r = 0;
        while(r<=row){
            int midr = (r+row)/2;
            if(matrix[midr][0]>target) row = midr-1;
            else if(matrix[midr][col]<target)   r = midr+1;
            else{
                int c = 0;
                while(c<=col){
                    int midc = (c+col)/2;
                    if(matrix[midr][midc]==target)  return true;
                    else if(matrix[midr][midc]<target)  c = midc+1;
                    else    col = midc-1;  
                }
                break;
            }
        }
        return false;
    }
    
    // public boolean searchMatrix(int[][] matrix, int target) {
    //     int row = matrix.length;
    //     int col = matrix[0].length;
    //     int r = 0;
    //     int c = col-1;
    //     while(r<row && c>=0){
    //         if(matrix[r][c]==target)    return true;
    //         else if(matrix[r][c]>target) c--;
    //         else r++;
    //     }
    //     return false;
    // }
}