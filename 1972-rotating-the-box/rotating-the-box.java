class Solution {
    public char[][] rotateTheBox(char[][] box) {
        int r = box.length;
        int c = box[0].length;
        char[][] matrix = new char[c][r];
        for(int i = 0;i<c;i++){
            for(int j=0;j<r;j++){
                matrix[i][j] = '.';
            }
        }
        for(int i = 0;i<r;i++){
            int down = c-1;
            for(int j = c-1;j>=0;j--){
                if(box[i][j]=='#')
                    matrix[down--][r-1-i] = '#';
                else if(box[i][j]=='*'){
                    matrix[j][r-1-i]='*';
                    down = j-1;
                }
            }
        }
        return matrix;
    }
}