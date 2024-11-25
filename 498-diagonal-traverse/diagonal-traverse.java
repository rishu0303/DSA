class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int r = mat.length;
        int c = mat[0].length;
        int res[] = new int[r*c];
        int index = 0;
        boolean up = true;
        int i = 0, j = 0;
        while(i<r && j<c){
            if(up){
                while(i>=0 && j<c)
                    res[index++] = mat[i--][j++];
                i++;
                if(j>=c){
                    j = c-1;
                    i++;
                }
            }else{
                while(j>=0 && i<r)
                    res[index++] = mat[i++][j--];
                j++;
                if(i>=r){
                    i = r-1;
                    j++;
                }
            }
            up = !up;
        }
        return res;
    }
}