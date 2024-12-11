class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int sum = 0;
        for(int i = 0;i<k;i++){
            sum+=cardPoints[i];
        }
        int len = cardPoints.length;
        int l = k-1;
        int r = len-1;
        int max = sum;
        while(l>=0){
            sum = sum-cardPoints[l--]+cardPoints[r--];
            max = Math.max(max,sum);
        }
        return max;
    }
}