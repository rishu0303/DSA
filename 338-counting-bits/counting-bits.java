class Solution {
    public int[] countBits(int n) {
        int[] bits = new int[n+1];
        for(int i = 0;i<=n;i++){
            int num = i;
            int count = 0;
            while(num>0){
                num = num&(num-1);
                count++;
            }
            bits[i] = count;
        }
        return bits;
    }
}