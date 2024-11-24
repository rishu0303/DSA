class Solution {
    public long maxMatrixSum(int[][] matrix) {
        int r = matrix.length, c = matrix[0].length;
        int count = 0;
        long sum = 0;
        long min = Integer.MAX_VALUE;
        for(int i = 0;i<r;i++){
            for(int j = 0;j<c;j++){
                int ele = matrix[i][j];
                if(ele<0){
                    count++;
                    ele = 0-ele;
                }
                sum+=ele;
                min = Math.min(min,ele);
            }
        }
        if((count&1)==1)  return sum-(min<<1);
        return sum;
    }
}